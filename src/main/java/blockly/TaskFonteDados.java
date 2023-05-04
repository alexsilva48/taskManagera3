package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class TaskFonteDados {

public static final int TIMEOUT = 300;

/**
 *
 * taskFonteDados
 *
 * @author Alex Sandro De Oliveira Silva
 * @since 03/05/2023, 11:17:22
 *
 */
public static Var topSemanal() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.dateTime.Operations.updateNewDate(
cronapi.dateTime.Operations.getNow(),
Var.valueOf("day"),
cronapi.math.Operations.subtract(
cronapi.dateTime.Operations.getDay(
cronapi.dateTime.Operations.getNow()),
Var.valueOf(8)));
   }
 }.call();
}

}

