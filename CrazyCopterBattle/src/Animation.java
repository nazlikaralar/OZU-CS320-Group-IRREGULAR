import java.awt.image.BufferedImage;

/*
 * Cs 320 Group Project / Group IRREGULAR
 * 
 * Crazy Copter Java Application Game Project (CCB)
 * 
 * Group Members : 
 * 1 - Erdi Ko�
 * 2 - Gamze K���k�olak
 * 3 - Mehmet Ka�an Kayaalp
 * 4 - Nazl� Karalar
 * 5 - �smetcan Herg�n�en
 * 
 */

public class Animation {

	private BufferedImage imageOfAnimation;
	private int frameWidth;
	private int frameHeight;
	private int numberOfFrames;
	private long frameTime; // Amount of time between frames in milliseconds.
	private long startingFrameTime;
	private long timeForNextFrame;
	private int currentFrameNumber;
	private boolean hasLoop;
	public int xLocation;
	public int yLocation;
	private int startingXLocationOfImageFrame;
	private int endingXLocationOfImageFrame;
	public boolean isActivated;
	private long showDelay;
	private long timeOfAnimationCreation;

	public Animation(BufferedImage animImage, int frameWidth, int frameHeight,
			int numberOfFrames, long frameTime, boolean loop, int x, int y,
			long showDelay) {

		this.imageOfAnimation = animImage;
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.numberOfFrames = numberOfFrames;
		this.frameTime = frameTime;
		this.hasLoop = loop;
		this.xLocation = x;
		this.yLocation = y;
		this.showDelay = showDelay;
		timeOfAnimationCreation = System.currentTimeMillis();
		startingXLocationOfImageFrame = 0;
		endingXLocationOfImageFrame = frameWidth;
		startingFrameTime = System.currentTimeMillis() + showDelay;
		timeForNextFrame = startingFrameTime + this.frameTime;
		currentFrameNumber = 0;
		isActivated = true;
	}
}