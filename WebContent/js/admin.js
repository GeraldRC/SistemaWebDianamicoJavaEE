new Chart(document.getElementById("estausu1"), {
  type: "doughnut",
  data: {
    labels: ["Solicitudes Nuevas", "Blue", "Yellow"],
    datasets: [
      {
        label: "My First Dataset",
        data: [100, 50, 100],
        backgroundColor: [
          "rgb(63, 205, 67)",
          "rgb(223, 22, 19)",
          "rgb(249, 245, 44)",
        ],
      },
    ],
  },
});
new Chart(document.getElementById("estausu2"), {
    type: "doughnut",
    data: {
      labels: ["Solicitudes Nuevas", "Blue", "Yellow"],
      datasets: [
        {
          label: "My First Dataset",
          data: [100, 50, 100],
          backgroundColor: [
            "rgb(255, 99, 132)",
            "rgb(54, 162, 235)",
            "rgb(255, 205, 86)",
          ],
        },
      ],
    },
  });
  new Chart(document.getElementById("estausu3"), {
    type: "doughnut",
    data: {
      labels: ["Solicitudes Nuevas", "Blue", "Yellow"],
      datasets: [
        {
          label: "My First Dataset",
          data: [100, 50, 100],
          backgroundColor: [
            "rgb(31, 133, 111)",
            "rgb(108, 20, 168)",
            "rgb(20, 168, 100)",
          ],
        },
      ],
    },
  });
