package com.highcapable.kavaref.extension;

import com.highcapable.kavaref.extension.TypeRef;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p000.AbstractC3831;
import p000.AbstractC5041;
import p000.AbstractC5378;
import p000.C1078;
import p000.C2036;
import p000.C2432;
import p000.InterfaceC4448;
import p000.InterfaceC5130;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeRef<T> {
    private final InterfaceC5130 rawType$delegate;
    private final InterfaceC5130 type$delegate;

    public TypeRef() {
        final int i = 0;
        this.type$delegate = new C2432(new InterfaceC4448(this) { // from class: ۦ٘ؖ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ TypeRef f14639;

            {
                this.f14639 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i2 = i;
                TypeRef typeRef = this.f14639;
                switch (i2) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
                }
            }
        });
        final int i2 = 1;
        this.rawType$delegate = new C2432(new InterfaceC4448(this) { // from class: ۦ٘ؖ

            /* JADX INFO: renamed from: ۦ۟ */
            public final /* synthetic */ TypeRef f14639;

            {
                this.f14639 = this;
            }

            @Override // p000.InterfaceC4448
            /* JADX INFO: renamed from: ۥۣ */
            public final Object mo449() {
                int i3 = i2;
                TypeRef typeRef = this.f14639;
                switch (i3) {
                    case 0:
                        return TypeRef.type_delegate$lambda$0(typeRef);
                    default:
                        return TypeRef.rawType_delegate$lambda$0(typeRef);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class rawType_delegate$lambda$0(TypeRef typeRef) {
        Type type = typeRef.getType();
        while (!(type instanceof Class)) {
            if (!(type instanceof ParameterizedType)) {
                throw new C2036("Cannot cast type " + type + " to java.lang.Class object.");
            }
            type = ((ParameterizedType) type).getRawType();
        }
        return (Class) type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type type_delegate$lambda$0(TypeRef typeRef) {
        Type genericSuperclass = typeRef.getClass().getGenericSuperclass();
        Class<TypeRef> cls = TypeRef.class;
        if (!(genericSuperclass instanceof ParameterizedType)) {
            Class<TypeRef> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
            if (AbstractC3831.m6874(genericSuperclass, clsM9037 != null ? clsM9037 : TypeRef.class)) {
                C1078.m2276("TypeRef must be created with a type argument: object : TypeRef<...>() {}.");
                return null;
            }
            C1078.m2276("Must only create direct subclasses of TypeRef.");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type rawType = parameterizedType.getRawType();
        Class<TypeRef> clsM9038 = AbstractC5378.m9037(AbstractC5041.m8557(cls));
        if (!AbstractC3831.m6874(rawType, clsM9038 != null ? clsM9038 : TypeRef.class)) {
            C1078.m2276("Must only create direct subclasses of TypeRef.");
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type type = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
        if (type != null) {
            return type;
        }
        C1078.m2276("Type argument cannot be null.");
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof TypeRef) && AbstractC3831.m6874(getType(), ((TypeRef) obj).getType());
    }

    public final Class<T> getRawType() {
        return (Class) this.rawType$delegate.getValue();
    }

    public final Type getType() {
        return (Type) this.type$delegate.getValue();
    }

    public int hashCode() {
        return getType().hashCode();
    }

    public String toString() {
        return getType().toString();
    }
}
