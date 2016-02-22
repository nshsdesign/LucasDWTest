package Collisions;

import org.lwjgl.util.vector.Vector3f;

//import org.lwjgl.util.Rectangle;

//import com.sun.j3d.utils.geometry.Box;

public class Basic {
		
	private Vector3f position, size;
	
	public Basic() {
		this.position.x = 0;
		this.position.y = 0;
		this.position.z = 0;
		
		this.size.x = 0;
		this.size.y = 0;
		this.size.z = 0;
	}
	public Basic(Vector3f Npositions, Vector3f Nsize) {
		this.position = Npositions;
		
		this.size = Nsize;
	}
	
	/*public void makeBoxGeometry() {
		Box mainBox = new Box(this.size.x, this.size.y, this.size.z, null); //3d box
	}
	
	public void makePlaneGeometry() {
		Rectangle mainPlane = new Rectangle((int)this.position.x, (int)this.position.y, (int)this.size.x, (int)this.size.y); //2d plane
	}*/
	
	public void setBoxPos(Vector3f updatePos) {
		this.position = updatePos;
	}
	
	public void setPlanePos(Vector3f updatePos) {
		this.position = updatePos;
	}
	
	public boolean checkCollisions(Basic body) {
		return((this.position.x + this.size.x) > (body.position.x) && 
			   (this.position.x) < (body.position.x + body.size.x) &&
			   (this.position.y + this.size.y) > (body.position.y) &&
			   (this.position.y) < (body.position.y + body.size.y) &&
			   (this.position.z + this.size.z) > (body.position.z) &&
			   (this.position.z) < (body.position.z + body.size.z));
	}
}
