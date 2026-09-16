package p000;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: ۦٕۧؑٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5804 implements WildcardType {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Type f19123;

    /* JADX INFO: renamed from: ۦۨ */
    public final Type f19124;

    public C5804(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            C0178.m393();
            throw null;
        }
        if (typeArr.length != 1) {
            C0178.m393();
            throw null;
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            AbstractC4554.m7924(typeArr[0]);
            this.f19123 = null;
            this.f19124 = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        AbstractC4554.m7924(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            C0178.m393();
            throw null;
        }
        this.f19123 = typeArr2[0];
        this.f19124 = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC4554.m7935(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f19123;
        return type != null ? new Type[]{type} : AbstractC4554.f15045;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f19124};
    }

    public final int hashCode() {
        Type type = this.f19123;
        return (this.f19124.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f19123;
        if (type != null) {
            return "? super " + AbstractC4554.m7902(type);
        }
        Type type2 = this.f19124;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC4554.m7902(type2);
    }
}
