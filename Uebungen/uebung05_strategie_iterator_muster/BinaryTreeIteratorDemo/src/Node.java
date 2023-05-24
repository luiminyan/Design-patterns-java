public class Node {
    //attributes
    private Person person;
    private Node leftNode;
    private Node rightNode;

    //constructor
    public Node(Person person){
        this.person = person;
    }

    //functions
    public void addRecursive(Person pToAdd){
        /*
        * p.id <= person.id
        * add to leftNode
        */
        if (pToAdd.getId() <= person.getId()){
            //if leftNode is empty
            if (leftNode == null) {
                leftNode = new Node(pToAdd);
            }
            //if leftNode is set
            else leftNode.addRecursive(pToAdd);
        }
        else {
            if (rightNode == null) {
                rightNode = new Node(pToAdd);
            }
            //if rightNode is set
            else rightNode.addRecursive(pToAdd);
        }
    }

    public Person findRecursive(int pID){
        // if pID = person,id
        if (pID == person.getId()) {
            return person;
        }
        //if pID < person.id, look into left child
        else if (pID < person.getId()) {
            if (leftNode == null) {
                return null;
            }
            else return leftNode.findRecursive(pID);
        }

        //else look into right child
        else {
            if (rightNode == null) {
                return null;
            }
            else return rightNode.findRecursive(pID);
        }
    }
}
