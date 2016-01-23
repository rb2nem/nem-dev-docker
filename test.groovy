// Code from https://forum.nem.io/t/nem-development-101-episode-02-idea-intellij-nem-core-vanity-gen/1665
import org.nem.core.crypto.KeyPair;
import org.nem.core.model.Address;
import org.nem.core.model.NetworkInfos;


final KeyPair someKey = new KeyPair();
System.out.println(String.format("Private key: %s", someKey.getPrivateKey()));
System.out.println(String.format(" Public key: %s", someKey.getPublicKey()));

final Address anAddress = Address.fromPublicKey(
              NetworkInfos.getTestNetworkInfo().getVersion(),
                                          someKey.getPublicKey());
System.out.println(String.format("    Address: %s", anAddress));

