package com.oracle.cap7.autoavaliaca.exercicio6;

public class Train {
	class RanOutOfTrack extends Exception {}
	class AnotherTrainComing extends Exception {}
	
	public static void main(String[] args) throws RanOutOfTrack, AnotherTrainComing {
		Train a = new Train();
		try{
			a.drive();
			System.out.println("honk! honk!");
//		}catch(RanOutOfTrack e) {
//		}catch(AnotherTrainComing | RanOutOfTrack e) {
		}catch(Exception e) {
			System.out.println("error driving");
			throw e;
		}
	}

	void drive() throws RanOutOfTrack, AnotherTrainComing {
		throw new RanOutOfTrack();
		
	}
}
