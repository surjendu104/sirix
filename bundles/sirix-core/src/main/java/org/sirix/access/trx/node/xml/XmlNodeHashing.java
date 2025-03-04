package org.sirix.access.trx.node.xml;

import org.sirix.access.ResourceConfiguration;
import org.sirix.access.trx.node.AbstractNodeHashing;
import org.sirix.access.trx.node.HashType;
import org.sirix.api.PageTrx;
import org.sirix.api.xml.XmlNodeReadOnlyTrx;
import org.sirix.node.interfaces.StructNode;
import org.sirix.node.interfaces.immutable.ImmutableXmlNode;

final class XmlNodeHashing extends AbstractNodeHashing<ImmutableXmlNode, XmlNodeReadOnlyTrx> {

  private final InternalXmlNodeReadOnlyTrx nodeReadOnlyTrx;

  /**
   * Constructor.
   *
   * @param resourceConfig  the resource configuration
   * @param nodeReadOnlyTrx the internal read-only node trx
   * @param pageWriteTrx    the page trx
   */
  XmlNodeHashing(final ResourceConfiguration resourceConfig, final InternalXmlNodeReadOnlyTrx nodeReadOnlyTrx,
      final PageTrx pageWriteTrx) {
    super(resourceConfig, nodeReadOnlyTrx, pageWriteTrx);
    this.nodeReadOnlyTrx = nodeReadOnlyTrx;
  }

  @Override
  protected StructNode getStructuralNode() {
    return nodeReadOnlyTrx.getStructuralNode();
  }

  @Override
  protected ImmutableXmlNode getCurrentNode() {
    return nodeReadOnlyTrx.getCurrentNode();
  }

  @Override
  protected void setCurrentNode(final ImmutableXmlNode node) {
    nodeReadOnlyTrx.setCurrentNode(node);
  }

}
