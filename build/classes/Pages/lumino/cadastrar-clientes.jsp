<%@page import="dominio.Livro"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page = "./sidebar.jsp" />      
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#">
					<em class="fa fa-home"></em>
				</a></li>
				<li class="active">Gerenciar clientes</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
			 <h1 class="page-header">Cadastrar</h1>
			</div>
		</div><!--/.row-->
				
				<div class="panel ">
					<div class="panel-body">
                      <div class="panel panel-default">
                        <div class="panel-heading">Cliente</div>
                        <div class="panel-body">
                        </div>
                      </div>
						
						<form role="form">
            
                            <div class="panel panel-info">
                              <div class="panel-heading">Dados Pessoais</div>
                              <div class="panel-body">
                                <div class="form-group">
                                  <label>Nome:</label>
                                  <input name="nome" class="form-control" >                 
                                  <label>Data de Nascimento:</label>
                                  <input name="data-nasc" type="date" class="form-control" >
                                  <label>Gênero:</label>
                                  <select name="genero" class="form-control">
                                    <option>Feminino</option>
                                    <option>Masculino</option>
                                    <option>Não desejo informar</option>
                                  </select>
                                  <label>CPF</label>
                                  <input name="cpf" class="form-control">
                              </div>
                            </div> 
                           </div> <!-- Panel - Dados Pessoais -->
                            <div class="panel panel-info">
                              <div class="panel-heading">Contatos</div>
                              <div class="panel-body">
                                <div class="form-group">
                                  <label>Telefone</label><br>
                                  <label>Tipo:</label>
                                  <select name="tipo-telefone" class="form-control">
                                    <option>Residencial</option>
                                    <option>Comercial</option>
                                    <option>Celular</option>
                                    <option>Recados</option>
                                  </select>
                                  <input name="telefone" class="form-control" placeholder="(11)">
                                  <input class="form-control" placeholder="99592-6070"> 
                              </div>
                            </div> 
                           </div> <!-- Panel - Contatos -->
                            <div class="panel panel-info">
                              <div class="panel-heading">Dados de Usuário</div>
                              <div class="panel-body">
                                <div class="form-group">
                                  <label>E-mail:</label>
                                  <input name="email" class="form-control" >
                                  <label>Senha:</label>
                                  <input name="senha" type="password" class="form-control" >
                              </div>
                            </div> 
                           </div> <!-- Panel - Dados de usuário -->  
                                                       
                           <div class="panel panel-info">
                            <div class="panel-heading">Endereço Residencial</div>
                              <div class="panel-body">
                                <div class="form-group">
                                   <label>Tipo de residência: *</label>
                                    <select name="tipo-residencia0" class="form-control"  >
                                      <option>Selecionar</option>
                                      <option selected>Casa</option>
                                      <option>Apartamento</option>
                                    </select>
                                    <label>Tipo do logradouro: *</label>
                                    <select name="tipo-logradouro0" class="form-control" >
                                      <option>Selecionar</option>
                                      <option >Alameda</option>
                                      <option>Avenida</option>
                                      <option>Rodovia</option>
                                      <option selected>Rua</option>
                                    </select>
                                  <label for="logradouro0">
                                    Logradouro: *
                                    <input name="logradouro0" class="form-control" type="text" value="Av. Carlos Barattino" >
                                  </label>
                                  <label for="numero0">
                                    Nº: *
                                    <input name="numero0" class="form-control" type="text" value="98" size="2">
                                  </label>
                                  <label for="bairro0">
                                      Bairro: *
                                      <input name="bairro0" class="form-control" type="text" value="Vila Nova Mogilar" >
                                  </label><br>
                                  <label>País: *</label>
                                  <select name="pais0" class="form-control" >
                                    <option selected>Brasil</option>
                                    <option>Bangladesh</option>
                                    <option>UK</option>
                                    <option>India</option>
                                  </select>   
                                  <label>UF: *</label>
                                  <select name="estado0" class="form-control" >
                                    <option selected>São Paulo</option>
                                    <option>Rio de Janeiro</option>
                                    <option>Rio Grande do Sul</option>
                                    <option>Santa Catarina</option>
                                    <option>Espirito Santo</option>
                                  </select>
                                  <label>Observações:</label>
                                  <input class="form-control" type="text" name="observacoes0" placeholder="Ex: Ap. 25, Fundos etc." >
                                  <div class="checkbox">
                                     <label>
                                       <input name="checkbox-endereco-cobranca" type="checkbox" onclick="toggleDisplayElement(this,'endereco-cobranca')" value=""> Considerar também para cobrança
                                     </label><br><br>
                                     <label>
                                       <input name="checkbox-endereco-entrega" type="checkbox"  onclick="toggleDisplayElement(this,'endereco-entrega')" value=""> Considerar também para entrega
                                     </label>
                                  </div>
                                </div>
                              </div> 
                             </div> <!-- Panel - Endereço Residencial -->
                           
                             <div class="panel panel-info endereco-entrega">
                              <div class="panel-heading">Endereço Entrega</div>
                                <div class="panel-body">
                                  <div class="form-group">
                                     <label>Tipo de residência: *</label>
                                      <select name="tipo-residencia0" class="form-control"  >
                                        <option>Selecionar</option>
                                        <option selected>Casa</option>
                                        <option>Apartamento</option>
                                      </select>
                                      <label>Tipo do logradouro: *</label>
                                      <select name="tipo-logradouro0" class="form-control" >
                                        <option>Selecionar</option>
                                        <option >Alameda</option>
                                        <option>Avenida</option>
                                        <option>Rodovia</option>
                                        <option selected>Rua</option>
                                      </select>
                                    <label for="logradouro1">
                                      Logradouro: *
                                      <input name="logradouro1" class="form-control" type="text"  value="Av. Carlos Barattino" >
                                    </label>
                                    <label for="numero1">
                                      Nº: *
                                      <input name="numero1" class="form-control" type="text"  value="98" size="2">
                                    </label>
                                    <label for="bairro1">
                                        Bairro: *
                                        <input name="bairro1" class="form-control" type="text" value="Vila Nova Mogilar" >
                                    </label><br>
                                    <label>País: *</label>
                                    <select name="pais1" class="form-control" >
                                      <option selected>Brasil</option>
                                      <option>Bangladesh</option>
                                      <option>UK</option>
                                      <option>India</option>
                                    </select>   
                                    <label>UF: *</label>
                                    <select name="estado1" class="form-control" >
                                      <option selected>São Paulo</option>
                                      <option>Rio de Janeiro</option>
                                      <option>Rio Grande do Sul</option>
                                      <option>Santa Catarina</option>
                                      <option>Espirito Santo</option>
                                    </select>
                                    <label>Observações:</label>
                                    <input class="form-control" type="text" name="observacoes1" placeholder="Ex: Ap. 25, Fundos etc." >
                                  </div>
                                </div> 
                             </div> <!-- Panel - Endereço Entrega -->                              
                             <div class="panel panel-info endereco-cobranca">
                              <div class="panel-heading">Endereço Cobrança</div>
                                <div class="panel-body">
                                  <div class="form-group">
                                     <label>Tipo de residência: *</label>
                                      <select name="tipo-residencia0" class="form-control"  >
                                        <option>Selecionar</option>
                                        <option selected>Casa</option>
                                        <option>Apartamento</option>
                                      </select>
                                      <label>Tipo do logradouro: *</label>
                                      <select name="tipo-logradouro0" class="form-control" >
                                        <option>Selecionar</option>
                                        <option >Alameda</option>
                                        <option>Avenida</option>
                                        <option>Rodovia</option>
                                        <option selected>Rua</option>
                                      </select>
                                    <label for="logradouro2">
                                      Logradouro: *
                                      <input name="logradouro2" class="form-control" type="text"  value="Av. Carlos Barattino" >
                                    </label>
                                    <label for="numero2">
                                      Nº: *
                                      <input name="numero2" class="form-control" type="text"  value="98" size="2">
                                    </label>
                                    <label for="bairro2">
                                        Bairro: *
                                        <input name="bairro2" class="form-control" type="text" value="Vila Nova Mogilar" >
                                    </label><br>
                                    <label>País: *</label>
                                    <select name="pais2" class="form-control" >
                                      <option selected>Brasil</option>
                                      <option>Bangladesh</option>
                                      <option>UK</option>
                                      <option>India</option>
                                    </select>   
                                    <label>UF: *</label>
                                    <select name="estado2" class="form-control" >
                                      <option selected>São Paulo</option>
                                      <option>Rio de Janeiro</option>
                                      <option>Rio Grande do Sul</option>
                                      <option>Santa Catarina</option>
                                      <option>Espirito Santo</option>
                                    </select>
                                    <label>Observações:</label>
                                    <input class="form-control" type="text" name="observacoes2" placeholder="Ex: Ap. 25, Fundos etc." >
                                  </div>
                                </div> 
                             </div> <!-- Panel - Endereço Cobrança -->   
                
                
						            
							
							   <button type="reset" class="btn btn-default">Cancelar</button>
							   <button type="submit" class="btn btn-primary">Salvar</button>
							
							</form>
						</div>
					</div>
				</div><!-- /.panel-->
			</div><!-- /.col-->
		</div><!-- /.row -->
	</div><!--/.main-->
	
<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/custom.js"></script>
	
</body>
</html>