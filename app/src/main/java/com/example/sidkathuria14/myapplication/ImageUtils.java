<<<<<<< HEAD
package com.example.sidkathuria14.myapplication;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.OutputStream;

import javax.imageio.ImageIO;

/**
 * 
 * @author Pandurang Kamath
 * Image utilty class
 *
 */
public class ImageUtils {

	/**
	 * 
	 * @param file File to be read
	 * @return the pixels as integer matrix
	 */
	public static int[][] compute(File file) {
		try {
			BufferedImage img = ImageIO.read(file);
			int w = img.getWidth(), h = img.getHeight();
			int pixels[][] = new int[w][h];
			for (int x = 0; x < w; x++) {
				for (int y = 0; y < h; y++) {
					pixels[x][y] = img.getRGB(x, y);
				}
			}

			return pixels;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Save the image
	 * @param pixels The integer matrix representing the data to be written
	 * @param output File to be saved to
	 */
	public static void saveImage(int pixels[][], OutputStream output) {
		int w = pixels.length;
		int h = pixels[0].length;

		BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				image.setRGB(i, j, pixels[i][j]);
			}
		}
		try {
			ImageIO.write((RenderedImage)image, "png", output);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
=======
//package com.example.sidkathuria14.myapplication;
//
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.awt.image.RenderedImage;
//import java.io.File;
//import java.io.OutputStream;
//
//import javax.imageio.ImageIO;
//
///**
// *
// * @author Pandurang Kamath
// * Image utilty class
// *
// */
//public class ImageUtils {
//
//	/**
//	 *
//	 * @param file File to be read
//	 * @return the pixels as integer matrix
//	 */
//	public static int[][] compute(File file) {
//		try {
////			Bitmap bitmap = BitmapFactory.decodeFileDescriptor(file)
////			String filePath = file.getPath();
////			Bitmap bitmap = BitmapFactory.decodeFile(filePath);
////			mImageView.setImageBitmap(bitmap);
//
////			bitmap.getWidth();
//			BufferedImage img = ImageIO.read(file);
//			int w = img.getWidth(), h = img.getHeight();
//			int pixels[][] = new int[w][h];
//			for (int x = 0; x < w; x++) {
//				for (int y = 0; y < h; y++) {
//					pixels[x][y] = img.getRGB(x, y);
//				}
//			}
//
//			return pixels;
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	/**
//	 * Save the image
//	 * @param pixels The integer matrix representing the data to be written
//	 * @param output File to be saved to
//	 */
//	public static void saveImage(int pixels[][], OutputStream output) {
//		int w = pixels.length;
//		int h = pixels[0].length;
//
//		BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
//		for (int i = 0; i < w; i++) {
//			for (int j = 0; j < h; j++) {
//				image.setRGB(i, j, pixels[i][j]);
//			}
//		}
//		try {
//			ImageIO.write((RenderedImage)image, "png", output);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
>>>>>>> ce3c5f074acc971b61fe027bc2173549cab9857d
