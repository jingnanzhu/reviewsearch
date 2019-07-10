FROM python:2.7.13
ENV DEBIAN_FRONTEND noninteractive
RUN pip install PyMySQL \
  && pip install pandas \
  && pip install MySQL-python \
  && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/*
WORKDIR /usr/src/app
COPY import_data.py ./
COPY data_fullstack.csv ./
CMD [ "python", "import_data.py" ]
