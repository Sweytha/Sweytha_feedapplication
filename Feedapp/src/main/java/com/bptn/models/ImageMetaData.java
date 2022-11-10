package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"ImageMetaData\"")
public class ImageMetaData {
	
	    @Id
	    @Column(name = "\"imageID\"")
	    private String imageid;

	    @Column(name = "\"imageName\"")
	    private String imagename;

	    @Column(name = "\"imageSize\"")
	    private String imagesize;

	    @Column(name = "\"imageFormat\"")
	    private String imageformat;

	    @Column(name = "\"imageDate\"")
	    private String imagedate;

	    @Column(name = "\"resolution\"")
	    private String resolution;

	    // Annotate for the foreign key
	    @Column(name = "\"postKey\"")
	    private String postkey;

		public ImageMetaData() {
			super();
		}

		public ImageMetaData(String imageid, String imagename, String imagesize, String imageformat, String imagedate,
				String resolution, String postkey) {
			super();
			this.imageid = imageid;
			this.imagename = imagename;
			this.imagesize = imagesize;
			this.imageformat = imageformat;
			this.imagedate = imagedate;
			this.resolution = resolution;
			this.postkey = postkey;
		}

		public String getImageid() {
			return imageid;
		}

		public void setImageid(String imageid) {
			this.imageid = imageid;
		}

		public String getImagename() {
			return imagename;
		}

		public void setImagename(String imagename) {
			this.imagename = imagename;
		}

		public String getImagesize() {
			return imagesize;
		}

		public void setImagesize(String imagesize) {
			this.imagesize = imagesize;
		}

		public String getImageformat() {
			return imageformat;
		}

		public void setImageformat(String imageformat) {
			this.imageformat = imageformat;
		}

		public String getImagedate() {
			return imagedate;
		}

		public void setImagedate(String imagedate) {
			this.imagedate = imagedate;
		}

		public String getResolution() {
			return resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}

		public String getPostkey() {
			return postkey;
		}

		public void setPostkey(String postkey) {
			this.postkey = postkey;
		}
	    
	    
	
	
	

}
