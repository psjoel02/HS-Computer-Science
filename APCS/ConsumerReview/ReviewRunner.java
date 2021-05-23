

import java.io.*;

public class ReviewRunner
{
	public static void main(String[]args) throws IOException
	{
		
		/*System.out.println(Review.sentimentVal("happily"));
		System.out.println(Review.sentimentVal("terrible"));
		System.out.println(Review.sentimentVal("cold"));
		System.out.println(Review.sentimentVal("gnarly"));
		System.out.println(Review.sentimentVal("funky"));
		
		System.out.println(Review.totalSentiment("SimpleReview.txt"));
		System.out.println(Review.starRating("SimpleReview.txt"));*/
		
		Review.separateAdjectives("positiveAdjectives.txt","negativeAdjectives.txt");
		//System.out.println(Review.fakeReview("SimpleReview.txt"));
		System.out.println(Review.fakeReview2("SimpleReview.txt"));
	}
}