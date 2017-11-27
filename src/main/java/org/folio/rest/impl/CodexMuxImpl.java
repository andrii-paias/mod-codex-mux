package org.folio.rest.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Handler;
import java.util.Map;
import javax.ws.rs.core.Response;
import org.folio.codex.Factory;
import org.folio.rest.jaxrs.resource.CodexInstancesResource;

public class CodexMuxImpl implements CodexInstancesResource {
  private static CodexInstancesResource mux = Factory.create();

  @Override
  public void getCodexInstances(String query, int offset, int limit, String lang, Map<String, String> okapiHeaders, Handler<AsyncResult<Response>> asyncResultHandler, Context vertxContext) throws Exception {
    mux.getCodexInstances(query, offset, limit, lang, okapiHeaders, asyncResultHandler, vertxContext);
  }

  @Override
  public void getCodexInstancesById(String id, String lang, Map<String, String> okapiHeaders, Handler<AsyncResult<Response>> asyncResultHandler, Context vertxContext) throws Exception {
    mux.getCodexInstancesById(id, lang, okapiHeaders, asyncResultHandler, vertxContext);
  }

}
