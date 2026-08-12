FROM python:3.14-alpine3.24

WORKDIR /app

ENV FLASK_APP=app.py
ENV FLASK_RUN_HOST=0.0.0.0
ENV PYTHONUNBUFFERED=1

RUN apk add --no-cache gcc musl-dev linux-headers

RUN pip install flask redis

EXPOSE 5000

CMD [ "flask", "run" ]
