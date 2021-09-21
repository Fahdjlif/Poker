
package tn.ittun.cards;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class PokerCards {
	static JPanel pane;
	static List<Integer> smallCards = new ArrayList<>();
	static List<Pair<Integer, Integer>> cardsPositions = new ArrayList<>();
	static final JButton startButton = new JButton();
	static final JButton stopButton = new JButton();
	static JFrame frame;
	static List<String> cards = new ArrayList<>();
	static List<String> coordinates = new ArrayList<>();
	static int lines = 0;
	static File file;
	static boolean keepProcessing;

	private static void init() {
		coordinates.addAll(Arrays.asList("0.168755 0.058682 0.024276 0.078778", "0.194205 0.058682 0.025059 0.078778",
				"0.248630 0.058682 0.025842 0.078778", "0.274080 0.057878 0.025059 0.077170",
				"0.327721 0.058682 0.024276 0.078778", "0.353171 0.057878 0.025059 0.077170",
				"0.407596 0.058682 0.024276 0.078778", "0.432655 0.057074 0.024276 0.078778",
				"0.411903 0.215434 0.020360 0.151125", "0.447925 0.221865 0.051684 0.151125",
				"0.117854 0.353698 0.019577 0.151125", "0.153485 0.361736 0.051684 0.151125",
				"0.392717 0.483119 0.052467 0.149518", "0.447925 0.483119 0.051684 0.149518",
				"0.503524 0.481511 0.053250 0.149518", "0.559514 0.483923 0.052467 0.151125",
				"0.614722 0.482315 0.051684 0.151125", "0.117854 0.588424 0.019577 0.151125",
				"0.154268 0.596463 0.051684 0.151125", "0.526625 0.763666 0.019577 0.151125",
				"0.561864 0.772508 0.050901 0.149518", "0.819499 0.352894 0.019577 0.149518",
				"0.855912 0.362540 0.053250 0.149518", "0.819890 0.586817 0.020360 0.151125",
				"0.855521 0.594051 0.050901 0.149518"));
		cards.add("clubs_ace");
		cards.add("clubs_two");
		cards.add("clubs_three");
		cards.add("clubs_four");
		cards.add("clubs_five");
		cards.add("clubs_six");
		cards.add("clubs_seven");
		cards.add("clubs_eight");
		cards.add("clubs_nine");
		cards.add("clubs_ten");
		cards.add("clubs_jack");
		cards.add("clubs_queen");
		cards.add("clubs_king");
		cards.add("diamonds_ace");
		cards.add("diamonds_two");
		cards.add("diamonds_three");
		cards.add("diamonds_four");
		cards.add("diamonds_five");
		cards.add("diamonds_six");
		cards.add("diamonds_seven");
		cards.add("diamonds_eight");
		cards.add("diamonds_nine");
		cards.add("diamonds_ten");
		cards.add("diamonds_jack");
		cards.add("diamonds_queen");
		cards.add("diamonds_king");
		cards.add("hearts_ace");
		cards.add("hearts_two");
		cards.add("hearts_three");
		cards.add("hearts_four");
		cards.add("hearts_five");
		cards.add("hearts_six");
		cards.add("hearts_seven");
		cards.add("hearts_eight");
		cards.add("hearts_nine");
		cards.add("hearts_ten");
		cards.add("hearts_jack");
		cards.add("hearts_queen");
		cards.add("hearts_king");
		cards.add("spades_ace");
		cards.add("spades_two");
		cards.add("spades_three");
		cards.add("spades_four");
		cards.add("spades_five");
		cards.add("spades_six");
		cards.add("spades_seven");
		cards.add("spades_eight");
		cards.add("spades_nine");
		cards.add("spades_ten");
		cards.add("spades_jack");
		cards.add("spades_queen");
		cards.add("spades_king");

		// 1
		cardsPositions.add(new Pair<>(639, 34));
		// 2
		cardsPositions.add(new Pair<>(744, 34));
		// 3
		cardsPositions.add(new Pair<>(966, 34));
		// 4
		cardsPositions.add(new Pair<>(1072, 34));
		// 5
		cardsPositions.add(new Pair<>(1294, 34));
		// 6
		cardsPositions.add(new Pair<>(1400, 34));
		// 7
		cardsPositions.add(new Pair<>(1622, 34));
		// 8
		cardsPositions.add(new Pair<>(1728, 34));
		// 9
		cardsPositions.add(new Pair<>(1651, 274));
		// 10
		cardsPositions.add(new Pair<>(1729, 288));
		// 11
		cardsPositions.add(new Pair<>(439, 553));
		// 12
		cardsPositions.add(new Pair<>(521, 567));
		// 13
		cardsPositions.add(new Pair<>(1507, 811));
		// 14
		cardsPositions.add(new Pair<>(1735, 811));
		// 15
		cardsPositions.add(new Pair<>(1961, 811));
		// 16
		cardsPositions.add(new Pair<>(2191, 811));
		// 17
		cardsPositions.add(new Pair<>(2421, 811));
		// 18
		cardsPositions.add(new Pair<>(441, 1023));
		// 19
		cardsPositions.add(new Pair<>(521, 1041));
		// 20
		cardsPositions.add(new Pair<>(2121, 1375));
		// 21
		cardsPositions.add(new Pair<>(2205, 1391));
		// 22
		cardsPositions.add(new Pair<>(3331, 553));
		// 23
		cardsPositions.add(new Pair<>(3411, 569));
		// 24
		cardsPositions.add(new Pair<>(3331, 1019));
		// 25
		cardsPositions.add(new Pair<>(3411, 1035));

	}

	private static void buildFrame() {

		frame = new JFrame("Poker table generator");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Random Poker Pics");
		frame.getContentPane().setLayout(new FlowLayout());

		startButton.setText("Start");
		startButton.setBounds(100, 100, 100, 40);
		stopButton.setText("Stop");
		stopButton.setBounds(100, 200, 100, 40);
		stopButton.setEnabled(false);
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				stopButton.setEnabled(true);
				startButton.setEnabled(false);
				keepProcessing = true;

				new Thread() {
					@Override
					public void run() {
						make(0);

					}
				}.start();

			}
		});
		stopButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startButton.setEnabled(true);
				stopButton.setEnabled(false);
				keepProcessing = false;
			}

		});

		frame.add(startButton);
		frame.add(stopButton);
		frame.setSize(300, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void save(BufferedImage bImg, long time) {

		try {

			if (ImageIO.write(bImg, "png", new File("output/" + time + ".png"))) {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static BufferedImage resize(BufferedImage img, int newW, int newH) {
		Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
		BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

		Graphics2D g2d = dimg.createGraphics();
		g2d.drawImage(tmp, 0, 0, null);
		g2d.dispose();

		return dimg;
	}

	public static void main(String[] args) {
		buildFrame();
		init();
	}

	private static  void make(int i) {

		while (keepProcessing) {
			Trace trace = new Trace();
			process();
			trace.measure("finished "+ (i+1));
			i++;
		}
	}

	private static void process() {

		try {

			BufferedImage source = ImageIO.read(new File("source/blueprint.png"));
			Graphics g = source.getGraphics();
			long currentTimeMillis = System.currentTimeMillis();
			String textFilePath = "output/" + currentTimeMillis + ".txt";
			file = new File(textFilePath);
			FileWriter writer = new FileWriter(textFilePath);

			cardsPositions.forEach(e -> {
				int randomInt = new Random().nextInt(52);
				String filePath = cards.get(randomInt) + ".png";

				try {

					writer.write(randomInt + " " + coordinates.get(lines) + "\n");
					String pathname = "source/" + filePath;
					BufferedImage logo = ImageIO.read(new File(pathname));
					if (e.right == 34) {
						BufferedImage resizedCard = resize(logo, 275, 350);
						g.drawImage(resizedCard, e.getLeft() - 82, e.getRight() - 97, null);
						lines++;
					} else {
						BufferedImage resizedCard = resize(logo, 560, 715);
						g.drawImage(resizedCard, e.getLeft() - 170, e.getRight() - 200, null);
						lines++;
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			});
			writer.close();
			save(source, currentTimeMillis);
			lines = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class Pair<L, R> {
		L left;
		R right;

		public Pair(L left, R right) {
			super();
			this.left = left;
			this.right = right;
		}

		public L getLeft() {
			return left;
		}

		public void setLeft(L left) {
			this.left = left;
		}

		public R getRight() {
			return right;
		}

		public void setRight(R right) {
			this.right = right;
		}

	}
}
