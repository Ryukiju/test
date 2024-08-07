package test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class TopicSend {
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//		HttpClient client = HttpClient.newHttpClient();
//		
//		for(int i=0; i<5; i++) {
//		
//			HttpRequest request = HttpRequest.newBuilder()
//					.uri(URI.create("http://192.168.5.246:8082/topics/rest_test"))
//					.POST(BodyPublishers.ofString("{\"records\":[{\"key\":null,\"value\":\"rest_test\"}]}"))
//					.header("Content-Type","application/vnd.kafka.json.v2+json")
////					.header("Accept","application/vnd.kafka.v2+json, application/vnd.kafka+json, application/json")
//					.build();
//
//
//			try {
//				HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
//
//				System.out.println(response.body());
//			}catch (Exception e) {
//				e.printStackTrace();
//			}	
//
//		}
//		
//	}	
	
	//��Ű�� ������Ʈ�� �׽�Ʈ
//	@SuppressWarnings("unchecked")
//	public static void main(String[] args) {
//		Properties props = new Properties();
//		props.put(ProducerConfig.CLIENT_ID_CONFIG, "client_id");
//		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,"192.168.5.240:9092,192.168.5.241:9092,192.168.5.242:9092");
//		props.put(ProducerConfig.ACKS_CONFIG,"all");
//		props.put("schema.registry.url", "http://192.168.5.245:8081");
////		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer");
////		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringSerializer");
////		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,"io.confluent.kafka.serializers.KafkaJsonSerializer");
////		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,"io.confluent.kafka.serializers.KafkaJsonSerializer");
////		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,KafkaJsonSerializer.class);
////		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,KafkaJsonSerializer.class);
//		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,KafkaJsonSerializer.class);
//		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,KafkaJsonSchemaSerializer.class);
//		
//
//		String topic = "schema_test";
////		String value = "{\"records\":[{\"value\":{\"schema\":{\"type\":\"struct\",\"fields\":[{\"type\":\"integer\",\"optional\":true,\"field\":\"id\"},{\"type\":\"string\",\"optional\":true,\"field\":\"name\"},{\"type\":\"integer\",\"optional\":true,\"field\":\"input_date\"}],\"optional\":false,\"name\":\"schema_test\"},\"payload\":{\"id\":15,\"name\":\"schema_test\",\"input_date\":1675146385467}}}]}";
////		String value = "{\"schema\":{\"type\":\"object\",\"fields\":[{\"type\":\"integer\",\"optional\":false,\"field\":\"id\"},{\"type\":\"string\",\"optional\":true,\"field\":\"name\"},{\"type\":\"integer\",\"optional\":true,\"field\":\"input_date\"}],\"optional\":false,\"name\":\"source_test\"},\"payload\":{\"id\":535,\"name\":\"smt_test\",\"input_date\":535}}";
////		String value = "{\"id\":29,\"name\":\"kiju\",\"input_date\":\"26\"}";
//		String value = "{\"schema\":{\"type\":\"object\",\"fields\":[{\"type\":\"integer\",\"optional\":false,\"field\":\"id\"},{\"type\":\"string\",\"optional\":true,\"field\":\"name\"},{\"type\":\"integer\",\"optional\":true,\"field\":\"input_date\"}],\"optional\":false,\"name\":\"source_test\"},\"payload\":{\"id\":212,\"name\":\"smt_test\",\"input_date\":321}}";
//		String schema = "{ "
//				+ "        \"type\": \"record\", "
//				+ "        \"fields\": [{ "
//				+ "                \"type\": \"long\", "
//				+ "                \"name\": \"id\" "
//				+ "            }, { "
//				+ "                \"type\": \"string\", "
//				+ "                \"name\": \"name\" "
//				+ "            }, { "
//				+ "                \"type\": \"long\", "
//				+ "                \"name\": \"input_date\" "
//				+ "            } "
//				+ "        ], "
//				+ "        \"name\": \"source_test\" "
//				+ "    }";
//		Schema.Parser schemaParser = new Schema.Parser();
//		Schema avroSchema = schemaParser.parse(schema);
//		
//		GenericRecord avroRecord = new GenericData.Record(avroSchema);
//		avroRecord.put("id", 121);
//		avroRecord.put("name", "avroSchema");
//		avroRecord.put("input_date", 121);
//		
////		System.out.println(avroRecord.getSchema());
//		
//		
//		try {
//			JSONParser parser = new JSONParser();
//			JSONObject jsonData = (JSONObject)parser.parse(value);
////			JSONObject testData = new JSONObject();
////			testData.put("id", 15);
//			JsonValue testData = new JsonValue(20,"kiju",27);
//			
//			final ProducerRecord<String, JsonValue> record = new ProducerRecord<>(topic, null,testData);
//
//			System.out.println("Start");
//			System.out.println(testData.toString());
//			
//			
//			
//			//Topic Send ������ ����
//			try (KafkaProducer<String, JsonValue> producer = new KafkaProducer<>(props);) {
//
//				Future<RecordMetadata> future = producer.send(record);
//				try {
//					RecordMetadata metadata = future.get();
//					System.out.println("Record sent to partition " + metadata.partition() + " with offset " + metadata.offset() + " - toString() : " + metadata.toString());
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				} catch (ExecutionException e) {
//					e.printStackTrace();
//				}
//			}
//			System.out.println("End");
//
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//	}	
}
