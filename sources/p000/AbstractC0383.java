package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۥؔؒۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0383 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4461 f1425;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4461 f1426;

    /* JADX INFO: renamed from: ۥۣ */
    public final C4461 f1427;

    public AbstractC0383(C4461 c4461, C4461 c4462, C4461 c4463) {
        this.f1427 = c4461;
        this.f1426 = c4462;
        this.f1425 = c4463;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Method m829(String str) throws NoSuchMethodException {
        C4461 c4461 = this.f1427;
        Method method = (Method) c4461.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0383.class.getClassLoader()).getDeclaredMethod("read", AbstractC0383.class);
        c4461.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۥُ */
    public abstract boolean mo830(int i);

    /* JADX INFO: renamed from: ۥّ */
    public final Parcelable m831(Parcelable parcelable, int i) {
        if (!mo830(i)) {
            return parcelable;
        }
        return ((C3514) this).f11633.readParcelable(C3514.class.getClassLoader());
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Class m832(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C4461 c4461 = this.f1425;
        Class cls2 = (Class) c4461.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c4461.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public abstract void mo833(int i);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract C3514 mo834();

    /* JADX INFO: renamed from: ۦؑ */
    public final Method m835(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C4461 c4461 = this.f1426;
        Method method = (Method) c4461.get(name);
        if (method != null) {
            return method;
        }
        Class clsM832 = m832(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM832.getDeclaredMethod("write", cls, AbstractC0383.class);
        c4461.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m836(InterfaceC3793 interfaceC3793) {
        if (interfaceC3793 == null) {
            ((C3514) this).f11633.writeString(null);
            return;
        }
        try {
            ((C3514) this).f11633.writeString(m832(interfaceC3793.getClass()).getName());
            C3514 c3514Mo834 = mo834();
            try {
                m835(interfaceC3793.getClass()).invoke(null, interfaceC3793, c3514Mo834);
                Parcel parcel = c3514Mo834.f11633;
                int i = c3514Mo834.f11638;
                if (i >= 0) {
                    int i2 = c3514Mo834.f11636.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC3793.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC3793 m837() {
        String string = ((C3514) this).f11633.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC3793) m829(string).invoke(null, mo834());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }
}
