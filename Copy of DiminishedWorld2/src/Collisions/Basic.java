package Collisions;

import javax.vecmath.Vector3f;

//import org.lwjgl.util.Rectangle;

//import com.sun.j3d.utils.geometry.Box;

public class Basic {
		
	private Vector3f position, size;
	
	public Basic(org.lwjgl.util.vector.Vector3f vector3f, org.lwjgl.util.vector.Vector3f vector3f2) {
		this.position.x = vector3f.x;
		this.position.y = vector3f.y; // set positions
		this.position.z = vector3f.z;
		
		this.size.x = vector3f2.z;
		this.size.y = vector3f2.y; //set size
		this.size.z = vector3f2.z;
	}
	
	/*public void makeBoxGeometry() {
		Box mainBox = new Box(this.size.x, this.size.y, this.size.z, null); //3d box
	}
	
	public void makePlaneGeometry() {
		Rectangle mainPlane = new Rectangle((int)this.position.x, (int)this.position.y, (int)this.size.x, (int)this.size.y); //2d plane
	}*/
	
	public void setBoxPos(Vector3f updatePos) {
		this.position.x = updatePos.x;
		this.position.y = updatePos.y; 
		this.position.z = updatePos.z;
	}
	
	public void setPlanePos(Vector3f updatePos) {
		this.position.x = updatePos.x;
		this.position.y = updatePos.y;
		this.position.z = updatePos.z;
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
