package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Task {

public static final int TIMEOUT = 300;

/**
 *
 * task
 *
 * @param id
 *
 * @author Alex Sandro De Oliveira Silva
 * @since 02/05/2023, 21:21:38
 *
 */
public static Var FinishedTask(@ParamMetaData(description = "id2", id = "e735c970") Var id2) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Tasks"), Var.valueOf("update \n	Tasks  \nset \n	completed = :completed \nwhere \n	id = :id"),Var.valueOf("completed",
    Var.VAR_TRUE),Var.valueOf("id",id2));
    return Var.VAR_NULL;
   }
 }.call();
}

}

