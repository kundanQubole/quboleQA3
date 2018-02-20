{
  "paragraphs": [
    {
      "text": "%md\n\u003ch1\u003eHello World!\u003c/h1\u003e\n\u003ch2\u003eWelcome !\u003c/h2\u003e\n\u003cinput type\u003d\u0027text\u0027\u003e\u003c/input\u003e\n\u003cp\u003eNice Time\u003c/p\u003e",
      "user": "kundank@qubole.com",
      "dateUpdated": "Feb 20, 2018 7:06:15 AM",
      "config": {
        "colWidth": 12.0,
        "graph": {
          "mode": "table",
          "height": 300.0,
          "optionOpen": false,
          "keys": [
            {
              "name": "count(1)",
              "index": 0.0,
              "aggr": "sum"
            }
          ],
          "values": [],
          "groups": [],
          "scatter": {
            "xAxis": {
              "name": "count(1)",
              "index": 0.0,
              "aggr": "sum"
            }
          }
        },
        "enabled": true,
        "editorMode": "ace/mode/markdown"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "version": "v0",
      "jobName": "paragraph_1519109221883_1437600262",
      "id": "20180220-064701_1347890562_q_PRB3898TAM1519107570",
      "result": {
        "code": "SUCCESS",
        "type": "HTML",
        "msg": "\u003cdiv class\u003d\"markdown-body\"\u003e\n\u003ch1\u003eHello World!\u003c/h1\u003e\n\u003ch2\u003eWelcome !\u003c/h2\u003e\n\u003cinput type\u003d\u0027text\u0027\u003e\u003c/input\u003e\n\u003cp\u003eNice Time\u003c/p\u003e\n\u003c/div\u003e"
      },
      "dateCreated": "Feb 20, 2018 6:47:01 AM",
      "dateSubmitted": "Feb 20, 2018 7:06:15 AM",
      "dateStarted": "Feb 20, 2018 7:06:15 AM",
      "dateFinished": "Feb 20, 2018 7:06:15 AM",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 1000
    },
    {
      "text": "%spark.sql\nSELECT COUNT(*) FROM default_qubole_memetracker",
      "user": "kundank@qubole.com",
      "dateUpdated": "Feb 20, 2018 7:27:34 AM",
      "config": {
        "colWidth": 12.0,
        "graph": {
          "mode": "table",
          "height": 300.0,
          "optionOpen": false,
          "keys": [],
          "values": [],
          "groups": [],
          "scatter": {}
        },
        "enabled": true,
        "editorMode": "ace/mode/sql"
      },
      "settings": {
        "params": {},
        "forms": {}
      },
      "runtimeInfos": {
        "jobUrl": {
          "propertyName": "jobUrl",
          "label": "JOB UI",
          "tooltip": "View in Spark web UI",
          "group": "spark",
          "values": [
            "https://qa3.qubole.net/cluster-proxy?encodedUrl\u003dhttp%3A%2F%2F10.230.189.34%3A8088%2Fproxy%2Fapplication_1519107831385_0001/jobs/job?spark\u003dtrue\u0026id\u003d3"
          ],
          "interpreterSettingId": "2D5TV99YT258261519107801468"
        }
      },
      "paragraphProgress": {
        "jobs": [
          {
            "id": 3,
            "jobUrl": "https://qa3.qubole.net/cluster-proxy?encodedUrl\u003dhttp%3A%2F%2F10.230.189.34%3A8088%2Fproxy%2Fapplication_1519107831385_0001/jobs/job?spark\u003dtrue\u0026id\u003d3",
            "numTasks": 451,
            "numCompletedTasks": 451,
            "stages": [
              {
                "id": 5,
                "completed": true,
                "stageUrl": "https://qa3.qubole.net/cluster-proxy?encodedUrl\u003dhttp%3A%2F%2F10.230.189.34%3A8088%2Fproxy%2Fapplication_1519107831385_0001/stages/stage/?id\u003d5\u0026attempt\u003d0",
                "numCompleteTasks": 1,
                "numActiveTasks": 0,
                "numFailedTasks": 0,
                "numTotalTasks": 1
              },
              {
                "id": 4,
                "completed": true,
                "stageUrl": "https://qa3.qubole.net/cluster-proxy?encodedUrl\u003dhttp%3A%2F%2F10.230.189.34%3A8088%2Fproxy%2Fapplication_1519107831385_0001/stages/stage/?id\u003d4\u0026attempt\u003d0",
                "numCompleteTasks": 450,
                "numActiveTasks": 0,
                "numFailedTasks": 0,
                "numTotalTasks": 450
              }
            ],
            "status": "Success"
          }
        ],
        "numCompletedTasks": 451,
        "numTasks": 451,
        "truncated": false
      },
      "version": "v0",
      "jobName": "paragraph_1519110229062_-1801509675",
      "id": "20180220-070349_1641618033_q_PRB3898TAM1519107570",
      "result": {
        "code": "SUCCESS",
        "type": "TABLE",
        "msg": "count(1)\n49104032\n"
      },
      "dateCreated": "Feb 20, 2018 7:03:49 AM",
      "dateSubmitted": "Feb 20, 2018 7:27:34 AM",
      "dateStarted": "Feb 20, 2018 7:27:34 AM",
      "dateFinished": "Feb 20, 2018 7:29:41 AM",
      "status": "FINISHED",
      "progressUpdateIntervalMs": 1000
    },
    {
      "text": "",
      "config": {},
      "settings": {
        "params": {},
        "forms": {}
      },
      "version": "v0",
      "jobName": "paragraph_1519111654483_1180127380",
      "id": "20180220-072734_1016147626_q_PRB3898TAM1519107570",
      "dateCreated": "Feb 20, 2018 7:27:34 AM",
      "status": "READY",
      "progressUpdateIntervalMs": 1000
    }
  ],
  "name": "Note1",
  "id": "PRB3898TAM1519107570",
  "angularObjects": {
    "2D5TV99YT258261519107801468:shared_process": [],
    "2D8R6GSNR258261519107801593:shared_process": [],
    "2D6V8YDS1258261519107801598:shared_process": [],
    "2D7W3H4GH258261519107801603:shared_process": []
  },
  "config": {
    "isDashboard": false
  },
  "info": {},
  "source": "FCN"
}