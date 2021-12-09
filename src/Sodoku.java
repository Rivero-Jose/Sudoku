import javax.swing.JOptionPane;
import java.util.Random;

public class Sodoku {
	Egg E = new Egg();
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int f = 6;
	int g = 7;
	int h = 8;
	int i = 9;
	
	int userGrid[][]=new int[][]
	           {{0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0},
	            {0,0,0,0,0,0,0,0,0}};
	int answerGrid[][]=new int[][]
			{{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0},
        	{0,0,0,0,0,0,0,0,0}};
	           /*{{a,b,c,d,e,f,g,h,i},
	            {d,e,f,g,h,i,a,b,c},
	            {g,h,i,a,b,c,d,e,f},
	            {b,a,d,c,f,e,h,i,g},
	            {c,f,e,h,i,g,b,a,d},
	            {h,i,g,b,a,d,c,f,e},
	            {e,c,a,f,d,b,i,g,h},
	            {f,d,b,i,g,h,e,c,a},
	            {i,g,h,e,c,a,f,d,b}};*/
	// Ad Ba Cg Dc Ei Ff Ge Hb Ih
	
	Random gene = new Random();
	public String in(String s){
		return JOptionPane.showInputDialog(s);
	}
	public void msg(String s){
		JOptionPane.showMessageDialog(null, s);
	}
	int qw = 0;
	public void newgame(){
		
		for(int j = 0; j < userGrid.length; j++){
			for(int k = 0; k < userGrid[j].length; k++){
				userGrid[j][k]=0;
			}
		}
	  int x = gene.nextInt(1)+ 1;
		if(x == 1){
			
		}/*else if(x == 2){
			a = 9;
			i = 1;
		}else if(x == 3){
			b = 8;
			h = 2;
		}else if(x == 4){
			c = 7;
			g = 3;
		}else if(x == 5){
			d = 6;
			f = 4;
		}else if(x == 6){
			a = 2;
			b = 1;
		}else if(x == 7){
			b = 3;
			c = 2;
		}else if(x == 8){
			c = 4;
			d = 3;
		}else if(x == 9){
			d = 5;
			e = 4;
		}else if(x == 10){
			e = 6;
			f = 5;
		}else if(x == 12){
			f = 7;
			g = 6;
		}else if(x == 13){
			g = 8;
			h = 7;
		}else if(x == 14){
			h = 9;
			i = 8;
		}else if(x == 15){
			a = 3;
			c = 1;
		}else if(x == 16){
			a = 4;
			d = 1;
		}else if(x == 17){
			a = 5;
			e = 1;
		}else if(x == 18){
			a = 6;
			f = 1;
		}else if(x == 19){
			a = 7;
			g = 1;
		}else if(x == 20){
			a = 8;
			h = 1;
		}else if(x == 21){
			b = 3;
			c = 2;
		}else if(x == 22){
			b = 4;
			d = 2;
		}else if(x == 23){
			b = 5;
			e = 2;
		}else if(x == 24){
			b = 6;
			f = 2;
		}else if(x == 25){
			b = 7;
			g = 2;
		}else if(x == 26){
			b = 9;
			i = 2;
		}else if(x == 27){
			c = 5;
			e = 3;
		}else if(x == 28){
			c = 6;
			f = 3; 
		}else if(x == 29){
			c = 8;
			h = 3;
		}else if(x == 30){
			c = 9;
			i = 3;
		}else if(x == 31){
			d = 6;
			f = 4;
		}else if(x == 32){
			d = 7;
			g = 4;
		}else if(x == 33){
			d = 8;
			h = 4;
		}else if(x == 34){
			d = 9;
			i = 4;
		}else if(x == 35){
			e = 7;
			g = 5;
		}else if(x == 36){
			e = 8;
			h =5;
		}else if(x == 37){
			e = 9;
			i = 5;
		}else if(x == 38){
			f = 8;
			h = 6;
		}else if(x == 39){
			f = 9;
			i = 6;
		}else if(x == 40){
			g = 9;
			i = 7;
		}*/		
		int Grid[][]=new int[][]
		           {{a,b,c,d,e,f,g,h,i},
		            {d,e,f,g,h,i,a,b,c},
		            {g,h,i,a,b,c,d,e,f},
		            {b,a,d,c,f,e,h,i,g},
		            {c,f,e,h,i,g,b,a,d},
		            {h,i,g,b,a,d,c,f,e},
		            {e,c,a,f,d,b,i,g,h},
		            {f,d,b,i,g,h,e,c,a},
		            {i,g,h,e,c,a,f,d,b}};
		for(int j = 0; j < Grid.length; j++){
			for(int k = 0; k < Grid.length; k++){
				answerGrid[j][k] = Grid[j][k];
			}
		}
		int ad = gene.nextInt(9);
		int ac = gene.nextInt(9);
		int ab = gene.nextInt(9);
		
		int aa = gene.nextInt(9);
		int bb = gene.nextInt(9);
		int cc = gene.nextInt(9);
		int dd = gene.nextInt(9);
		int ee = gene.nextInt(9);
		int ff = gene.nextInt(9);
		int gg = gene.nextInt(9);
		int hh = gene.nextInt(9);
		int ii = gene.nextInt(9);
		int jj = gene.nextInt(9);
		int kk = gene.nextInt(9);
		int ll = gene.nextInt(9);
		int mm = gene.nextInt(9);
		int nn = gene.nextInt(9);
		int oo = gene.nextInt(9);
		int pp = gene.nextInt(9);
		int qq = gene.nextInt(9);
		int rr = gene.nextInt(9);
		int ss = gene.nextInt(9);
		int tt = gene.nextInt(9);
		int uu = gene.nextInt(9);
		int vv = gene.nextInt(9);
		int ww = gene.nextInt(9);
		int xx = gene.nextInt(9);
		int yy = gene.nextInt(9);
		int zz = gene.nextInt(9);
		int zzz = gene.nextInt(9);
		
		int za = gene.nextInt(9);
		int zb = gene.nextInt(9);
		int zc = gene.nextInt(9);
		
		userGrid[ad][zc] = answerGrid[ad][zc];
		userGrid[ac][zb] = answerGrid[ac][zb];
		userGrid[ab][za] = answerGrid[ab][za];
		userGrid[aa][zzz] = answerGrid[aa][zzz];
		userGrid[bb][zz] = answerGrid[bb][zz];
		userGrid[cc][yy] = answerGrid[cc][yy];
		userGrid[dd][xx] = answerGrid[dd][xx];
		userGrid[ee][ww] = answerGrid[ee][ww];
		userGrid[ff][vv] = answerGrid[ff][vv];
		userGrid[gg][uu] = answerGrid[gg][uu];
		userGrid[hh][tt] = answerGrid[hh][tt];
		userGrid[ii][ss] = answerGrid[ii][ss];
		userGrid[jj][rr] = answerGrid[jj][rr];
		userGrid[kk][qq] = answerGrid[kk][qq];
		userGrid[ll][pp] = answerGrid[ll][pp];
		userGrid[mm][oo] = answerGrid[mm][oo];
		userGrid[nn][nn] = answerGrid[nn][nn];
		userGrid[oo][mm] = answerGrid[oo][mm];
		userGrid[pp][ll] = answerGrid[pp][ll];
		userGrid[qq][kk] = answerGrid[qq][kk];
		userGrid[rr][jj] = answerGrid[rr][jj];
		userGrid[ss][ii] = answerGrid[ss][ii];
		userGrid[tt][hh] = answerGrid[tt][hh];
		userGrid[uu][gg] = answerGrid[uu][gg];
		userGrid[vv][ff] = answerGrid[vv][ff];
		userGrid[ww][ee] = answerGrid[ww][ee];
		userGrid[xx][dd] = answerGrid[xx][dd];
		userGrid[yy][cc] = answerGrid[yy][cc];
		userGrid[zz][bb] = answerGrid[zz][bb];
		userGrid[zzz][aa] = answerGrid[zzz][aa];
		userGrid[za][ab] = answerGrid[za][ab];
		userGrid[zb][ac] = answerGrid[zb][ac];
		userGrid[zc][ad] = answerGrid[zc][ad];
		
		
		welcome();
		
	}
	
	public void welcome(){
		if(qw == 0){
		msg("Welcome to Sudoku!\n"
				+ "There is 81 squares on a grid \n" +
				"The point of the game is to have a number 1 to 9 per row, per column per 3 by 3 box appear once \n" +
				"Good luck! \n" +
				"Type in the row letter followed by the column letter to change values \n" +
				"Type in the full word as they appear on screen as it will shown on the Sudoku puzzle to use those actions\n");
		qw++;
		home();
		}else if(qw == 1){
			home();
		}
	}
	public void home(){
		String s = in("Sudoku\n" +
				"Type in row letter then column letter Ex. Aa\n" +
				"newgame)   help)   submit)   music)   quit)\n" +
				"      a   b   c     d   e   f     g   h   i\n" +
				"A   "+userGrid[0][0]+"   "+userGrid[0][1]+"   "+userGrid[0][2]+"     "+userGrid[0][3]+"   "+userGrid[0][4]+"   "+userGrid[0][5]+"     "+userGrid[0][6]+"   "+userGrid[0][7]+"   "+userGrid[0][8]+"\n"+
				"B   "+userGrid[1][0]+"   "+userGrid[1][1]+"   "+userGrid[1][2]+"     "+userGrid[1][3]+"   "+userGrid[1][4]+"   "+userGrid[1][5]+"     "+userGrid[1][6]+"   "+userGrid[1][7]+"   "+userGrid[1][8]+"\n"+
				"C   "+userGrid[2][0]+"   "+userGrid[2][1]+"   "+userGrid[2][2]+"     "+userGrid[2][3]+"   "+userGrid[2][4]+"   "+userGrid[2][5]+"     "+userGrid[2][6]+"   "+userGrid[2][7]+"   "+userGrid[2][8]+"\n"+
				"\nD   "+userGrid[3][0]+"   "+userGrid[3][1]+"   "+userGrid[3][2]+"     "+userGrid[3][3]+"   "+userGrid[3][4]+"   "+userGrid[3][5]+"     "+userGrid[3][6]+"   "+userGrid[3][7]+"   "+userGrid[3][8]+"\n"+
				"E   "+userGrid[4][0]+"   "+userGrid[4][1]+"   "+userGrid[4][2]+"     "+userGrid[4][3]+"   "+userGrid[4][4]+"   "+userGrid[4][5]+"     "+userGrid[4][6]+"   "+userGrid[4][7]+"   "+userGrid[4][8]+"\n"+
				"F   "+userGrid[5][0]+"   "+userGrid[5][1]+"   "+userGrid[5][2]+"     "+userGrid[5][3]+"   "+userGrid[5][4]+"   "+userGrid[5][5]+"     "+userGrid[5][6]+"   "+userGrid[5][7]+"   "+userGrid[5][8]+"\n"+
				"\nG   "+userGrid[6][0]+"   "+userGrid[6][1]+"   "+userGrid[6][2]+"     "+userGrid[6][3]+"   "+userGrid[6][4]+"   "+userGrid[6][5]+"     "+userGrid[6][6]+"   "+userGrid[6][7]+"   "+userGrid[6][8]+"\n"+
				"H   "+userGrid[7][0]+"   "+userGrid[7][1]+"   "+userGrid[7][2]+"     "+userGrid[7][3]+"   "+userGrid[7][4]+"   "+userGrid[7][5]+"     "+userGrid[7][6]+"   "+userGrid[7][7]+"   "+userGrid[7][8]+"\n"+
				"I    "+userGrid[8][0]+"   "+userGrid[8][1]+"   "+userGrid[8][2]+"     "+userGrid[8][3]+"   "+userGrid[8][4]+"   "+userGrid[8][5]+"     "+userGrid[8][6]+"   "+userGrid[8][7]+"   "+userGrid[8][8]);
		
		
		
		if(s.equals("Aa")){
			//a
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
			double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[0][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}
			catch(Exception e){
				msg("Not valid");
				home();
			}
			
			
			
		}else if(s.equals("Bg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[1][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Cd")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[2][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Db")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[3][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Eh")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[4][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fe")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[5][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gc")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[6][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Hi")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[7][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("If")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == a){
				userGrid[8][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ab")){
			//b
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[0][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Bh")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[1][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ce")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[2][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Da")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[3][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Eg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[4][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fd")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[5][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gf")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[6][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Hc")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[7][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ii")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == b){
				userGrid[8][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ac")){
			//c
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[0][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Bi")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[1][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Cf")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[2][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Dd")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[3][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ea")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[4][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[5][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gb")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[6][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Hh")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[7][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ie")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == c){
				userGrid[8][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ad")){
			//d
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[0][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ba")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[1][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Cg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[2][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Dc")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[3][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ei")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[4][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ff")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[5][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ge")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[6][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Hb")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[7][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ih")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == d){
				userGrid[8][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ae")){
			//e
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[0][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Bb")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[1][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Ch")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[2][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Df")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[3][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Ec")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[4][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Fi")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[5][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Ga")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[6][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Hg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[7][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Id")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == e){
				userGrid[8][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Af")){
			//f
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[0][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}

		}else if(s.equals("Bc")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[1][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ci")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[2][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("De")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[3][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Eb")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[4][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fh")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[5][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gd")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[6][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ha")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[7][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ig")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == f){
				userGrid[8][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ag")){
			//g
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[0][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Bd")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[1][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ca")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[2][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Di")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[3][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ef")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[4][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fc")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[5][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gh")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[6][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("He")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[7][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ib")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == g){
				userGrid[8][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ah")){
			//h
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[0][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Be")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[1][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Cb")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[2][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Dg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[3][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ed")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[4][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fa")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[5][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gi")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[6][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Hf")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[7][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ic")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == h){
				userGrid[8][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ai")){
			//i
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[0][8] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Bf")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[1][5] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Cc")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[2][2] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Dh")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[3][7] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ee")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[4][4] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Fb")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[5][1] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Gg")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[6][6] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Hd")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[7][3] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("Ia")){ 
			String t = in("Enter a number 1 to 9\n" +
					"back)");
			if(t.equals("back")){
				home();
			}
			try{
				double n = Double.parseDouble(t);
			if(n > 0 && n < 10){
			if(n == i){
				userGrid[8][0] = (int)n;
				home();
			}else{
				msg("Not valid");
				home();
			}
			}else{
				msg("Not valid");
				home();
			}
			}catch(Exception e){
				msg("Not valid");
				home();
			}
		}else if(s.equals("help")){
			help();
		}else if(s.equals("newgame")){
			newgame();
		}else if(s.equals("submit")){
			submit();
		}else if(s.equals("quit")){
			
		}else if(s.equals("music")){
			E.music();
			home();
		}else{
			msg("Error, nothing was chosen");
			home();
		}
	}
	
	public void help(){
		msg("You are looking at the help page \n" +
				"There can only be 1 of each number from 1 to 9 per row, per column and per 3 by 3 box \n" +
				"To change the numbers in the sudoku type the row letter followed by the column letter\n" +
				"Use newgame) if u want to start a new game\n" +
				"Use submit to finalize your answer and gain a reward\n" +
				"FUN FACT: Difficulty level is random, as well as the puzzles! Therefore the number puzzles are almost limitless! Even if it's a small change per puzzle.");
		home();
	}
	
	public void submit(){
		int count = 0 ;
		for(int j = 0; j < answerGrid.length; j++){
			for(int k = 0; k < answerGrid.length; k++){
				if(userGrid[j][k] == answerGrid[j][k]){
					count++;
				}else{
					msg("There is an incorrect answer");
					home();
					break;
				}
			}
		}
		if(count == 81){
			msg("Good Job!");
			E.music1();
		}else{
			msg("There is an incorrect answer");
			home();
		}
		
	}
	
	

}