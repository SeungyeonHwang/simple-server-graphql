package io.oenomel.stonk.app.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserEntity is a Querydsl query type for UserEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserEntity extends EntityPathBase<UserEntity> {

    private static final long serialVersionUID = -1402159928L;

    public static final QUserEntity userEntity = new QUserEntity("userEntity");

    public final ListPath<io.oenomel.stonk.app.account.AccountEntity, io.oenomel.stonk.app.account.QAccountEntity> accounts = this.<io.oenomel.stonk.app.account.AccountEntity, io.oenomel.stonk.app.account.QAccountEntity>createList("accounts", io.oenomel.stonk.app.account.AccountEntity.class, io.oenomel.stonk.app.account.QAccountEntity.class, PathInits.DIRECT2);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final StringPath email = createString("email");

    public final StringPath name = createString("name");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QUserEntity(String variable) {
        super(UserEntity.class, forVariable(variable));
    }

    public QUserEntity(Path<? extends UserEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserEntity(PathMetadata metadata) {
        super(UserEntity.class, metadata);
    }

}

