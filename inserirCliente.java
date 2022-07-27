public void inserirCliente(Connection conn, Cliente cliente) {
    try {
        Statenent st = conn.createStatement();
        String sql = "INSERT INTO `cliente` (nome, idade, profissao, cidade, estado) VALUES ('"+cliente.getNome() + "',"+ cliente.getIdade() + ", '"+cliente.getProfissao() +"', '"+cliente.getCidade() +"', '"+cliente.getEstado() + "')";
        st.executeUpdate(sql);
        st.close();
    } catch (SqlException ex) {
        System.out.println(ex);
    }
}