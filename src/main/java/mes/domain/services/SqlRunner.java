package mes.domain.services;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public interface SqlRunner {

	public List<Map<String, Object>> getRows(String sql, MapSqlParameterSource mapParam);

	public List<Map<String, Object>> selectList (String sql, Map<String, Object> mapParam);
	
	public Map<String, Object> getRow(String sql, MapSqlParameterSource mapParam);
	
	public int execute(String sql, MapSqlParameterSource mapParam);
	
	public int queryForCount(String sql,  MapSqlParameterSource mapParam);
	
	public <T> T queryForObject(String sql,  MapSqlParameterSource mapParam, RowMapper<T> mapper);
}
