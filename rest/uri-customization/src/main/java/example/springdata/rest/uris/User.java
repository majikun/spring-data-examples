/*
 * Copyright 2015 the original author or authors.
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
package example.springdata.rest.uris;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A {@link User}.
 * 
 * @author Oliver Gierke
 */
@Entity
public class User {

    private  @Id UUID id = UUID.randomUUID();
    private  String username;
    private  String value;
    
    public User() {
        
    }

    public User(String username, String value) {
        this.username = username;
        this.value = value;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
