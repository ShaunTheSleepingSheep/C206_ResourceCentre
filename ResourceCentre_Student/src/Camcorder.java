
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += String.format("%-68s %-20d\n", this.getAssetTag(), this.getDescription(), this.getIsAvailable(), this.getDueDate(),
				this.getOpticalZoom());
		return output;
	}
}

