package net.corda.contracts;

import net.corda.core.contracts.Amount;
import net.corda.core.contracts.ContractState;
import net.corda.core.contracts.Issued;
import net.corda.core.contracts.PartyAndReference;
import net.corda.core.crypto.CompositeKey;

import java.time.Instant;
import java.util.Currency;

/* This is an interface solely created to demonstrate that the same kotlin tests can be run against
 * either a Java implementation of the CommercialPaper or a kotlin implementation.
 * Normally one would not duplicate an implementation in different languages for obvious reasons, but it demonstrates that
 * ultimately either language can be used against a common test framework (and therefore can be used for real).
 */
public interface ICommercialPaperState extends ContractState {
    ICommercialPaperState withOwner(CompositeKey newOwner);

    ICommercialPaperState withIssuance(PartyAndReference newIssuance);

    ICommercialPaperState withFaceValue(Amount<Issued<Currency>> newFaceValue);

    ICommercialPaperState withMaturityDate(Instant newMaturityDate);
}
