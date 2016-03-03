package Collisions;

import org.lwjgl.util.vector.Vector3f;

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
	
	public void setBoxPos(Vector3f updatePos) {
		this.position = updatePos;
	}
	
	public void setPlanePos(Vector3f updatePos) {
		this.position = updatePos;
	}
	
	public boolean checkCollisions(Basic body) {
		return((this.position.x + this.size.x) >= (body.position.x) && 
		   (this.position.x) <= (body.position.x + body.size.x) &&
		   (this.position.y + this.size.y) >= (body.position.y) &&
		   (this.position.y) <= (body.position.y + body.size.y) &&
		   (this.position.z + this.size.z) >= (body.position.z) &&
		   (this.position.z) <= (body.position.z + body.size.z));
	}
	
	public String checkFaceCollisions(Basic body) {
		if((this.position.x < body.position.x) && ((this.position.x + this.size.x) < (body.position.x + body.size.x))) {
			return("right");
		}
		if((this.position.x > body.position.x) && ((this.position.x + this.size.x) > (body.position.x + body.size.x))) {
			return("left");
		}
		if((this.position.y < body.position.y) && ((this.position.y + this.size.y) < (body.position.y + body.size.y))) {
			return("up");
		}
		if((this.position.y > body.position.y) && ((this.position.y + this.size.y) > (body.position.y + body.size.y))) {
			return("down");
		}
		if((this.position.z > body.position.z) && ((this.position.z + this.size.z) > (body.position.z + body.size.z))) {
			return("forward");
		}
		if((this.position.z > body.position.z) && ((this.position.z + this.size.z) > (body.position.z + body.size.z))) {
			return("back");
		}
		return "";
	}
	
}
