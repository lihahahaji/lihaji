public class TV {
		int channel=1;
		int volumeLevel=1;
		boolean on=false;
		
		public void TV(){}
		
		public void turnOn()
		{
			this.on=true;
		}
		
		public void turnOff()
		{
			this.on=false;
		}
		
		public void setChannel(int newChannel)
		{
			if(on&&newChannel>=1&&newChannel<=7)
			{
				this.channel=newChannel;
			}
		}
		
		public void setVolume(int newVolumeLevel)
		{
			if(on&&newVolumeLevel>=1&&newVolumeLevel<=7)
			{
				this.volumeLevel=newVolumeLevel;
			}
		}
		
		public void channelUp()
		{
			if(on&&this.channel<120)
			{
				this.channel++;
			}
		}
		
		public void channelDown()
		{
			if(on&&this.channel>1)
			{
				this.channel--;
			}
		}
		
		public void volumeUp()
		{
			if(on&&this.volumeLevel<7)
			{
				this.volumeLevel++;
			}
		}
		
		public void volumeDown()
		{
			if(on&&this.volumeLevel>1)
			{
				this.volumeLevel--;
			}
		}
}
