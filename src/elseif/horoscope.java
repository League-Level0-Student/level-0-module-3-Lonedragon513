package elseif;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String Hi = JOptionPane.showInputDialog("e=what key?");
		if (Hi.equals("Aries")) {
			JOptionPane.showMessageDialog(null,
					"The symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. The typical Aries person is full of vitality, curiosity, and has a heightened sense of justice. They often excel at anything where a bit of competition is involved, whether this is of a cognitive nature or physical. The challenge is the thing. If there is a chance to win, to best someone, to show off abilities, Aries is in it to win it. The Aries person feels most alive when they are in control and leading others. They are often impatient and abrupt with those whom they feel are not their equals and are in a leadership position. Most Aries do not like being told what to do if the person in charge is less talented than they.");
		}
		if (Hi.equals("Taurus")) {
			JOptionPane.showMessageDialog(null,
					"Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical. This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in this dimension. Food, drink, sex, luxury, are all sought after by the typical taruean. Because this sign loves luxury they are willing to work hard to obtain it. They are slow to anger, but once disturbed it can be volatile. Taurus signs look for stability in their lives and in their partners and co-workers. Taurus people are not in a hurry, typically, and it can take them many years to decide what it is that they would like to do for a living, or where they’d like to go on vacation. Many of this sign prefer to live in the country as they are drawn to the earth and the natural world. Earth signs tend to have solid, reputable natures, which coincides with the Earth.");
		} else if (Hi.equals("Gemini")) {
			JOptionPane.showMessageDialog(null,
					"The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone. Gemini are never happier than when they are sharing ideas and concepts with someone else. Communication is a key element for this sign, so many of this sign go into occupations that include some communication in some large capacity. Curiosity is a key characteristic of this sign, and they are people persons. Gemini are great at parties because they can find almost anything to talk about with anyone. Gemini are adventurous by nature and so engage in traveling as often as they can as it affords them the opportunity to meet new people, experience new ideas, and to learn new concepts.");
		} else if (Hi.equals("Cancer")) {
			JOptionPane.showMessageDialog(null,
					"The crab symbolizes this sign for good reason. Just as the crab carries its own shell on its back, so too, does the typical cancerian…so to speak. The typical cancer person is all about home and family and is very dedicated and loyal to friends and family. Crabs often move sideways instead of moving in a straight line, and so will the person of this sign. Often, if it will avoid a fight, or achieve the goal, then moving in alternative directions to arrive at the destination is typical. They tend to grasp and hold tightly those things that make them happy, and never let go. The key characteristic of this sign is that Cancer people need to be needed. They need to know that they matter to someone and that they are secure in that love. Brave, courageous, protective, all describe the best possible traits of this sign. Shy, reserved, brooding, and moody, do not serve the cancer person well, but may surface if their needs are not being met");
		} else if (Hi.equals("leo")) {
			JOptionPane.showMessageDialog(null,
					"The lion is the symbol for this sign because the lion embodies the best characteristics of the leo; proud, regal, relaxed, and in charge. Leo people know they are in charge, even when it may seem outwardly that they are not.");
		} else if (Hi.equals("Virgo")) {
			JOptionPane.showMessageDialog(null,
					"The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things. They tend to be extremely detail oriented and particularly like producing something that is not only useful, but beautiful and skillful.");
		} else if (Hi.equals("libra")) {
			JOptionPane.showMessageDialog(null,
					"Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign.");
		} else if (Hi.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null,
					"The symbol for Scorpio is the scorpion. This creature was chosen because it typifies many of the characteristics of this sign. ");
		} else if (Hi.equals("Sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"The centaur is the symbol for this sign. In mythology, the centaur was half man and half horse, given to pursing pleasure. The centaur is shown with a bow, which he shoots. Wherever the arrow lands, the centaur follows, retrieves the arrow and shoots again. Those born under this sign will love travelling, discovering new things, meeting new people, and learning new things.");
		} else if (Hi.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null,
					"The mountain goat is the symbol for this sign because of the characteristic of the goat to climb higher and higher without losing his footing. Capricorn people are the type that are goal oriented and driven to succeed despite all odds. They will work long and hard hours toward a purposeful goal. Self-disciplined and successful, it is no wonder that some of the world’s greatest scientists, leaders, and teachers have been Capricorn");
		} else if (Hi.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null,
					"The man who carries the pitcher of water is the symbol for this sign. This is because Aquarians are often generous with their time and resources. For this reason this sign often find themselves in occupations where they are helping on some humanitarian level. They are interested and have a deep concern for the welfare of others. They never know a stranger and are generally loved by all around them. Aquarians never meet a stranger and often will go out of their way to meet with people that they’ve not heard from for years. Connection is at the core of this sign.");
		} else if (Hi.equals("Pisces")) {
			JOptionPane.showMessageDialog(null,
					"The fish is the symbol given to this sign, primarily because fish live in a secretive and mysterious place. Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselves. They have a happy and vibrant inner life that few get to share or see. They are deeply caring about others and don’t like to see people become unhappy.");
		} else {
			JOptionPane.showMessageDialog(null, "it is not a sign");
		}

	}
}
