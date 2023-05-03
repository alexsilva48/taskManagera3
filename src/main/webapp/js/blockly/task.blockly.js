window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Task = window.blockly.js.blockly.Task || {};

/**
 * @function OpenModal
 *
 * task
 *
 *
 * @author Alex Sandro De Oliveira Silva
 * @since 02/05/2023, 22:15:23
 *
 */
window.blockly.js.blockly.Task.OpenModalArgs = [];
window.blockly.js.blockly.Task.OpenModal = async function() {

  //
  this.cronapi.screen.showModal("modal63782");
}

/**
 * @function CloseModal
 *
 *
 *
 *
 * @author Alex Sandro De Oliveira Silva
 * @since 02/05/2023, 22:15:23
 *
 */
window.blockly.js.blockly.Task.CloseModalArgs = [];
window.blockly.js.blockly.Task.CloseModal = async function() {

  //
  this.cronapi.screen.hideModal("modal63782");
}
