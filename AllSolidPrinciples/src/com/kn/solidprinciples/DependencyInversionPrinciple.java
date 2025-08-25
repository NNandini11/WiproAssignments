package com.kn.solidprinciples;


	public class DependencyInversionPrinciple {

	    interface Speaker {
	        void playSound();
	    }

	    static class BluetoothSpeaker implements Speaker {
	        public void playSound() {
	            System.out.println("Playing sound through Bluetooth Speaker...");
	        }
	    }

	    static class MusicPlayer {
	        Speaker speaker;

	        MusicPlayer(Speaker speaker) {
	            this.speaker = speaker;
	        }

	        void playMusic() {
	            speaker.playSound();
	        }
	    }

	    public static void main(String[] args) {
	        Speaker mySpeaker = new BluetoothSpeaker();
	        MusicPlayer player = new MusicPlayer(mySpeaker);
	        player.playMusic();
	    }
	}



