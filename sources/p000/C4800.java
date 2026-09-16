package p000;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ۦٞؕٙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4800 extends C4369 {

    /* JADX INFO: renamed from: ۥؔ */
    public static C4800 f15836;

    /* JADX INFO: renamed from: ۦۜ */
    public static final C4575 f15837 = new C4575(3);

    /* JADX INFO: renamed from: ۦٖ */
    public final Application f15838;

    public C4800(Application application) {
        super(4);
        this.f15838 = application;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static AbstractC0941 m8178(Class cls, Application application) {
        if (!AbstractC2217.class.isAssignableFrom(cls)) {
            return AbstractC1605.m3366(cls);
        }
        try {
            return (AbstractC0941) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            C0178.m394("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            C0178.m394("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C0178.m394("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            C0178.m394("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    @Override // p000.C4369, p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0941 mo474(Class cls, C4397 c4397) {
        if (this.f15838 != null) {
            return mo475(cls);
        }
        Application application = (Application) c4397.f18983.get(f15837);
        if (application != null) {
            return m8178(cls, application);
        }
        if (!AbstractC2217.class.isAssignableFrom(cls)) {
            return AbstractC1605.m3366(cls);
        }
        C1078.m2272("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    @Override // p000.C4369, p000.InterfaceC0217
    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC0941 mo475(Class cls) {
        Application application = this.f15838;
        if (application != null) {
            return m8178(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
