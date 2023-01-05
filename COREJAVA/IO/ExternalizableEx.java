package in.co.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableEx implements Externalizable {
	
	transient int temp ;
	String name;
	int physics ;
	int chemistry ;
	int maths ;
	

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	  out.writeObject(name);
	  out.writeObject(maths);
	  out.writeObject(physics);
	  out.writeObject(chemistry);
	  out.writeObject(temp);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		physics = in.readInt();
		chemistry = in.readInt();
		maths = in.readInt();
		temp = in.readInt();
	}

}
