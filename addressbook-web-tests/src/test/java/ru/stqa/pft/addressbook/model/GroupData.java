package ru.stqa.pft.addressbook.model;

public class GroupData {
    private String groupName;
    private String grHeader;
    private String grFooter;

    public GroupData(String GroupName, String grHeader, String grFooter) {
        groupName = GroupName;
        this.grHeader = grHeader;
        this.grFooter = grFooter;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGrHeader() {
        return grHeader;
    }

    public String getGrFooter() { return grFooter();
    }
}
