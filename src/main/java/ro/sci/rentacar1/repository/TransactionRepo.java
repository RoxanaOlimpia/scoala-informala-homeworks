package ro.sci.rentacar1.repository;

import ro.sci.rentacar1.domain.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roxana on 8/15/2017.
 */
public class TransactionRepo<Transaction> implements RepoInterface<Transaction> {

    public List<Transaction> transactionRepoList = new ArrayList<Transaction>();

//CONSTRUCTOR without parameters
    public TransactionRepo() {
    }

//CONSTRUCTOR with parameters
    public TransactionRepo(List<Transaction> transactionRepoList) {
            this.transactionRepoList = transactionRepoList;
    }

//GETTER for the transaction list
    public List<Transaction> getTransactionRepoList() {
            return transactionRepoList;
        }


//Implementation of CRUD methods

    public void add(Transaction transaction) {
       transactionRepoList.add(transaction);
    }

    public List<Transaction> find() {
        return transactionRepoList;
    }

    public void update(Transaction transaction) {
        getTransactionRepoList().set(transactionRepoList.indexOf(transactionRepoList), transaction);
    }

    public void delete(Transaction transaction) {
        transactionRepoList.remove(transaction);

    }

}
