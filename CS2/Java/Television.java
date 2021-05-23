
public class Television
{
    // constants
    public final int MAX_CHANNEL = 100;
    public final int MIN_CHANNEL = 1;
    public final int MAX_VOLUME  = 10;
    public final int MIN_VOLUME  = 1;
    public final int DEFAULT_CHANNEL = 3;
    public final int DEFAULT_VOLUME  = 5;

    // instance variables
    private int channel;
    private int volume;
	public int time = 1;
    public int i = 0;
    public int j = 0;

    // constructors
    public Television()
    {

    }

    public Television(int c, int v)
    {

    channel = c;
    volume = v;
    }


    // accessor methods
    public int getChannel()
    {
    	if(i < time)
    		{
    	channel = DEFAULT_CHANNEL;
    	i++;
    		}
        return channel;
    }

    public int getVolume()
    {
    	if(j < time)
    	{
    	volume = DEFAULT_VOLUME;
    	j++;
    	}
        return volume;
    }

    // mutator methods

    /* This method increases the channel by one.
     * If the channel increase exceeds the value of MAX_CHANNEL
     * then the channel should be set to MIN_CHANNEL.
     */
    public void increaseChannel()
    {
      channel++;
      if (channel > MAX_CHANNEL)
      {
      	channel = MIN_CHANNEL;
      }
    }

    /* This method decreases the channel by one.
     * If the channel decrease exceeds the value of MIN_CHANNEL
     * then the channel should be set to MAX_CHANNEL.
     */
    public void decreaseChannel()
    {
channel--;
      if (channel < MIN_CHANNEL)
      {
      	channel = MAX_CHANNEL;
      }
    }

    /* This method changes the channel to the value specified
     * in the parameter list. If the value of the parameter is
     * not a valid channel number then the channel should
     * remain unchanged.
     * @param c the channel to be changed to
     */
    public void selectChannel(int c)
    {
      if (c >= MIN_CHANNEL && c <= MAX_CHANNEL)
      	channel = c;
    }

    /* This method increases the volume by one.
     * If MAX_VOLUME is reached a call to increaseVolume
     * should have no effect.
     */
    public void increaseVolume()
    {
      volume++;
      if (volume > MAX_VOLUME)
      {
      	volume--;
      }

    }

    /* This method decreases the volume by one.
     * If MIN_VOLUME is reached a call to decreaseVolume
     * should have no effect.
     */
    public void decreaseVolume()
    {
      volume--;
      if (volume < MIN_VOLUME)
      {
      	volume++;
      }

    }
}