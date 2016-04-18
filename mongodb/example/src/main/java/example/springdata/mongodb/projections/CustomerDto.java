/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
<<<<<<< Updated upstream:mongodb/example/src/main/java/example/springdata/mongodb/projections/CustomerDto.java
package example.springdata.mongodb.projections;

import lombok.Value;
=======
package example.springdata.rest.stores;

import static org.springframework.data.mongodb.core.index.GeoSpatialIndexType.GEO_2DSPHERE;
>>>>>>> Stashed changes:rest/starbucks/src/main/java/example/springdata/rest/stores/Address.java

/**
 * A sample DTO only containing the firstname.
 * 
 * @author Oliver Gierke
 */
<<<<<<< Updated upstream:mongodb/example/src/main/java/example/springdata/mongodb/projections/CustomerDto.java
@Value
class CustomerDto {

	String firstname;
=======
public class Address {

    private String street, city, zip;
    private @GeoSpatialIndexed(type = GEO_2DSPHERE) Point location;

    public Address(String street, String city, String zip, Point location) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return String.format("%s, %s %s", street, zip, city);
    }
>>>>>>> Stashed changes:rest/starbucks/src/main/java/example/springdata/rest/stores/Address.java
}
