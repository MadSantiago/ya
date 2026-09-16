package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: ۦَؙؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3549 implements ParameterizedType {

    /* JADX INFO: renamed from: ۥْ */
    public final Type[] f11780;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Type f11781;

    /* JADX INFO: renamed from: ۦۨ */
    public final Type f11782;

    public C3549(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                C0178.m393();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            AbstractC4554.m7924(type3);
        }
        this.f11782 = type;
        this.f11781 = type2;
        this.f11780 = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC4554.m7935(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f11780.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f11782;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f11781;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f11780) ^ this.f11781.hashCode();
        Type type = this.f11782;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f11780;
        int length = typeArr.length;
        Type type = this.f11781;
        if (length == 0) {
            return AbstractC4554.m7902(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC4554.m7902(type));
        sb.append("<");
        sb.append(AbstractC4554.m7902(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC4554.m7902(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
