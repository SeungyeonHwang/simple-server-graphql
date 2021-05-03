package io.oenomel.stonk.app.account;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAccountEntity is a Querydsl query type for AccountEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAccountEntity extends EntityPathBase<AccountEntity> {

    private static final long serialVersionUID = -114332634L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAccountEntity accountEntity = new QAccountEntity("accountEntity");

    public final NumberPath<Long> accountId = createNumber("accountId", Long.class);

    public final StringPath accountNumber = createString("accountNumber");

    public final NumberPath<Long> amount = createNumber("amount", Long.class);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final EnumPath<io.oenomel.stonk.common.Constants.AccountStatus> status = createEnum("status", io.oenomel.stonk.common.Constants.AccountStatus.class);

    public final DateTimePath<java.time.LocalDateTime> suspendedAt = createDateTime("suspendedAt", java.time.LocalDateTime.class);

    public final io.oenomel.stonk.app.user.QUserEntity user;

    public QAccountEntity(String variable) {
        this(AccountEntity.class, forVariable(variable), INITS);
    }

    public QAccountEntity(Path<? extends AccountEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAccountEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAccountEntity(PathMetadata metadata, PathInits inits) {
        this(AccountEntity.class, metadata, inits);
    }

    public QAccountEntity(Class<? extends AccountEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new io.oenomel.stonk.app.user.QUserEntity(forProperty("user")) : null;
    }

}

