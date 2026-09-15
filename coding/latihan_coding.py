import cv2
from ultralytics import YOLO

modeln = YOLO("yolov8n.pt") # cepat dan ringan
# models = YOLO("yolov8s.pt") # cepat dan ringan
# modelm = YOLO("yolov8m.pt") # cepat dan ringan
# modell = YOLO("yolov8l.pt") # cepat dan ringan
# modelx = YOLO("yolov8x.pt") # cepat dan ringan

# Inisialisasi kamera
cap = cv2.VideoCapture(0) # Ganti 0 dengan path kamera jika diperlukan

if not cap.isOpened():
    print("Error: Could not open camera.")
    exit()

while True:
    ret, frame = cap.read()

    if not ret:
        print("Error: Could not read frame.")
        break
    result = modeln(frame) # ganti model sesuai kebutuhan

    annotated = result[0].plot()
    cv2.imshow("Results - yolov8n", annotated)

    # Tekan 'q' untuk keluar dari loop
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Bersihkan dan tutup jendela
cap.release()
cv2.destroyAllWindows()