package global.shortcuts.keyboadshortcuts.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shortcut implements Serializable {

    private String name;
    private List<String> keys;
    private String description;
    private String imageUri;
    private int upVote;
    private int downVote;
    private String key;

    public Shortcut() {
        keys = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Shortcut{" +
                "name='" + name + '\'' +
                ", keys=" + keys +
                ", description='" + description + '\'' +
                '}';
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
