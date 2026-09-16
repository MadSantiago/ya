package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: ۥَۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2241 implements GenericArrayType {

    /* JADX INFO: renamed from: ۦۨ */
    public final Type f7428;

    public C2241(Type type) {
        this.f7428 = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC4554.m7935(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f7428;
    }

    public final int hashCode() {
        return this.f7428.hashCode();
    }

    public final String toString() {
        return AbstractC4554.m7902(this.f7428) + "[]";
    }
}
