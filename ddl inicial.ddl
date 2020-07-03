
CREATE TABLE administrador (
    id          NUMBER NOT NULL,
    usuario_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX administrador__idx ON
    administrador (
        usuario_id
    ASC );

ALTER TABLE administrador ADD CONSTRAINT administrador_pk PRIMARY KEY ( id );

CREATE TABLE asesoria (
    id           NUMBER NOT NULL,
    visita_id_1  NUMBER NOT NULL
);

CREATE UNIQUE INDEX asesoria__idx ON
    asesoria (
        visita_id_1
    ASC );

ALTER TABLE asesoria ADD CONSTRAINT asesoria_pk PRIMARY KEY ( id );

CREATE TABLE capacitacion (
    id           NUMBER NOT NULL,
    visita_id_1  NUMBER NOT NULL
);

CREATE UNIQUE INDEX capacitacion__idx ON
    capacitacion (
        visita_id_1
    ASC );

ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY ( id );

CREATE TABLE cheklist (
    asesoria_id        NUMBER NOT NULL,
    id_1               NUMBER NOT NULL,
    tipos_cheklist_id  NUMBER NOT NULL
);

ALTER TABLE cheklist ADD CONSTRAINT cheklist_pk PRIMARY KEY ( id_1 );

CREATE TABLE cliente (
    rut                VARCHAR2(12) NOT NULL,
    razon_social       VARCHAR2(100),
    direccion          VARCHAR2(100),
    comuna             VARCHAR2(100),
    telefono           NUMBER,
    actidad_economica  VARCHAR2(100),
    tipo_de_empresa    VARCHAR2(100),
    usuario_id         NUMBER NOT NULL
);

CREATE UNIQUE INDEX cliente__idx ON
    cliente (
        usuario_id
    ASC );

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rut );

CREATE TABLE estado_mejora (
    id      NUMBER NOT NULL,
    estado  VARCHAR2(50)
);

ALTER TABLE estado_mejora ADD CONSTRAINT estado_mejora_pk PRIMARY KEY ( id );

CREATE TABLE estado_pago (
    id           NUMBER NOT NULL,
    estado_pago  VARCHAR2(20)
);

ALTER TABLE estado_pago ADD CONSTRAINT estado_pago_pk PRIMARY KEY ( id );

CREATE TABLE estado_solicitud (
    id      NUMBER NOT NULL,
    estado  VARCHAR2(50)
);

ALTER TABLE estado_solicitud ADD CONSTRAINT estado_solicitud_pk PRIMARY KEY ( id );

CREATE TABLE mejoras (
    asesoria_id       NUMBER NOT NULL,
    id_1              NUMBER NOT NULL,
    estado_mejora_id  NUMBER NOT NULL
);

ALTER TABLE mejoras ADD CONSTRAINT mejoras_pk PRIMARY KEY ( id_1,
                                                            estado_mejora_id );

CREATE TABLE pagos (
    id_1            NUMBER NOT NULL,
    cliente_rut     VARCHAR2(12) NOT NULL,
    estado_pago_id  NUMBER NOT NULL
);

ALTER TABLE pagos ADD CONSTRAINT pagos_pk PRIMARY KEY ( id_1 );

CREATE TABLE profesional (
    id          NUMBER NOT NULL,
    usuario_id  NUMBER NOT NULL
);

CREATE UNIQUE INDEX profesional__idx ON
    profesional (
        usuario_id
    ASC );

ALTER TABLE profesional ADD CONSTRAINT profesional_pk PRIMARY KEY ( id );

CREATE TABLE reporte_accidente (
    id           NUMBER NOT NULL,
    fecha        VARCHAR2(30),
    cliente_rut  VARCHAR2(12) NOT NULL
);

ALTER TABLE reporte_accidente ADD CONSTRAINT reporte_accidente_pk PRIMARY KEY ( id );

CREATE TABLE rol (
    id   NUMBER NOT NULL,
    rol  VARCHAR2(20)
);

ALTER TABLE rol ADD CONSTRAINT rol_pk PRIMARY KEY ( id );

CREATE TABLE solicitud_visita (
    estado_solicitud_id  NUMBER NOT NULL,
    cliente_rut          VARCHAR2(12) NOT NULL,
    id                   NUMBER NOT NULL
);

ALTER TABLE solicitud_visita ADD CONSTRAINT solicitud_visita_pk PRIMARY KEY ( id );

CREATE TABLE tipos_cheklist (
    id NUMBER NOT NULL
);

ALTER TABLE tipos_cheklist ADD CONSTRAINT tipos_cheklist_pk PRIMARY KEY ( id );

CREATE TABLE trabajador (
    rut        VARCHAR2(13) NOT NULL,
    nombre     VARCHAR2(50),
    direccion  VARCHAR2(100),
    comuna     VARCHAR2(100),
    telefono   NUMBER,
    sexo       VARCHAR2(10)
);

ALTER TABLE trabajador ADD CONSTRAINT trabajador_pk PRIMARY KEY ( rut );

CREATE TABLE "trabajador-accidente" (
    trabajador_rut        VARCHAR2(13) NOT NULL,
    reporte_accidente_id  NUMBER NOT NULL
);

ALTER TABLE "trabajador-accidente" ADD CONSTRAINT id PRIMARY KEY ( trabajador_rut,
                                                                   reporte_accidente_id );

CREATE TABLE usuario (
    id        NUMBER NOT NULL,
    rol_id    NUMBER NOT NULL,
    nombre    VARCHAR2(20),
    apellido  VARCHAR2(20),
    password  VARCHAR2(20)
);

ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( id );

CREATE TABLE visita (
    profesional_id  NUMBER NOT NULL,
    id_1            NUMBER NOT NULL
);

ALTER TABLE visita ADD CONSTRAINT visita_pk PRIMARY KEY ( id_1 );

ALTER TABLE administrador
    ADD CONSTRAINT administrador_usuario_fk FOREIGN KEY ( usuario_id )
        REFERENCES usuario ( id );

ALTER TABLE mejoras
    ADD CONSTRAINT asesoria_fk FOREIGN KEY ( asesoria_id )
        REFERENCES asesoria ( id );

ALTER TABLE asesoria
    ADD CONSTRAINT asesoria_visita_fk FOREIGN KEY ( visita_id_1 )
        REFERENCES visita ( id_1 );

ALTER TABLE capacitacion
    ADD CONSTRAINT capacitacion_visita_fk FOREIGN KEY ( visita_id_1 )
        REFERENCES visita ( id_1 );

ALTER TABLE cheklist
    ADD CONSTRAINT cheklist_asesoria_fk FOREIGN KEY ( asesoria_id )
        REFERENCES asesoria ( id );

ALTER TABLE cheklist
    ADD CONSTRAINT cheklist_tipos_cheklist_fk FOREIGN KEY ( tipos_cheklist_id )
        REFERENCES tipos_cheklist ( id );

ALTER TABLE solicitud_visita
    ADD CONSTRAINT cliente_fk FOREIGN KEY ( cliente_rut )
        REFERENCES cliente ( rut );

ALTER TABLE cliente
    ADD CONSTRAINT cliente_usuario_fk FOREIGN KEY ( usuario_id )
        REFERENCES usuario ( id );

ALTER TABLE mejoras
    ADD CONSTRAINT estado_mejora_fk FOREIGN KEY ( estado_mejora_id )
        REFERENCES estado_mejora ( id );

ALTER TABLE solicitud_visita
    ADD CONSTRAINT estado_solicitud_fk FOREIGN KEY ( estado_solicitud_id )
        REFERENCES estado_solicitud ( id );

ALTER TABLE pagos
    ADD CONSTRAINT pagos_cliente_fk FOREIGN KEY ( cliente_rut )
        REFERENCES cliente ( rut );

ALTER TABLE pagos
    ADD CONSTRAINT pagos_estado_pago_fk FOREIGN KEY ( estado_pago_id )
        REFERENCES estado_pago ( id );

ALTER TABLE profesional
    ADD CONSTRAINT profesional_usuario_fk FOREIGN KEY ( usuario_id )
        REFERENCES usuario ( id );

ALTER TABLE reporte_accidente
    ADD CONSTRAINT reporte_accidente_cliente_fk FOREIGN KEY ( cliente_rut )
        REFERENCES cliente ( rut );

ALTER TABLE "trabajador-accidente"
    ADD CONSTRAINT reporte_accidente_fk FOREIGN KEY ( reporte_accidente_id )
        REFERENCES reporte_accidente ( id );

ALTER TABLE "trabajador-accidente"
    ADD CONSTRAINT trabajador_fk FOREIGN KEY ( trabajador_rut )
        REFERENCES trabajador ( rut );

ALTER TABLE usuario
    ADD CONSTRAINT usuario_rol_fk FOREIGN KEY ( rol_id )
        REFERENCES rol ( id );

ALTER TABLE visita
    ADD CONSTRAINT visita_profesional_fk FOREIGN KEY ( profesional_id )
        REFERENCES profesional ( id );

