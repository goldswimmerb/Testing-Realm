# Testing-Realm
Space for testing methods and such.

Sec4 1:
public int getCount(int value) {
		int count = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(value==matrix[i][j]){
					count++;
				}
			}
		}
		return count;
	}
	
Sec4 2:
public int getLargest(){
		int largest = 0;
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				if(matrix[i][j]>largest){
					largest = matrix[i][j];
				}
			}
		}
		return largest;
	}

Sec4 3:
public getColTotal(int columnVal){
		int result = 0;
		for(int i = 0; i < matrix[0].length; i++){
			result+= matrix[i][columnVal];
		}
		return result;
	}
	
Sec5:
1. Yup
2. Yup
3. Nah Bruh
4. Yup
5. Yup
6. Yup
7. Nope

Exer:

3:
public static void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}
	
4:
public static void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}
	
5:
public static void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		int avg = 0;
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				avg = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj
						.getBlue()) / 3;
				pixelObj.setRed(avg);
				pixelObj.setGreen(avg);
				pixelObj.setBlue(avg);

			}
		}
	}

6:
public static void fixUnderWater() {
	Pixel[][] pixels = this.getPixels2D();
	int avg = 0;
	for (Pixel[] rowArray : pixels) {
		for (Pixel pixelObj : rowArray) {
			pixelObj.setRed(20);
			pixelObj.setGreen(20);
			pixelObj.setBlue(200);

		}
	}
}
	
Sec6:
1. 
public static void mirrorVerticalRightToLeft(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int width = pixels[0].length;
	for(int i = 0; i < pixels.length; i++){
		for(int j = width-1; j > width/2; j--){
			leftPixel = pixels[i][j];
			rightPixel = pixels[i][width-1-j];
			rightPixel.setColor(leftPixel.getColor());
		}
	}
}

2.
public static void mirrorHorizontal(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel botPixel = null;
	int height = pixels.length;
	for(int i = 0; i < height / 2; i++){
		for(int j = 0; j < pixels.length; j++){
			topPixel = pixels[i][j];
			botPixel = pixels[i][height-1-j];
			botPixel.setColor(leftPixel.getColor());
		}
	}
}

3.
public static void mirrorHorizontalBotToTop(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel botPixel = null;
	int height = pixels.length;
	for(int i = height-1; i > height/2; i--){
		for(int j = 0; j < pixels.length; j++){
			topPixel = pixels[i][j];
			botPixel = pixels[i][height-1-j];
			botPixel.setColor(leftPixel.getColor());
		}
	}
}

4.
public static void mirrorDiagonal(){
	Pixel[][] pixels = this.getPixels2D();
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	int diagLength = Math.sqrt((pixels[0].length*pixels[0].length)+(pixels.length*pixels.length));
	for(int row = 0; row < pixels.length; row++){
		for(int j = 0; j < i; j++){
			leftPixel = pixels[row][j];
			rightPixel = pixels[row][height-1-j];
			rightPixel.setColor(leftPixel.getColor());
		}
	}
}

