pragma solidity ^0.5.1;

contract MyContract {
    address creator;

    function MyContract () {
        creator = msg.sender;
    }

    // TODO Add functions

    /**********
     Standard kill() function to recover funds 
     **********/
    function kill() {
        if (msg.sender == creator) {
            suicide(creator); // kills this contract and sends remaining funds back to creator
        }
    }
}
