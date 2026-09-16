package p000;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: ۥؚْؒۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0771 implements InterfaceC2090 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f2788;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f2789;

    public /* synthetic */ C0771(int i, Object obj) {
        this.f2789 = i;
        this.f2788 = obj;
    }

    @Override // p000.InterfaceC2090
    public final Object get() {
        int i = this.f2789;
        Object obj = this.f2788;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new C3887("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new C3887(AbstractC3761.m6629("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new C3887(AbstractC3761.m6629("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new C3887(AbstractC3761.m6628("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new C3887(AbstractC3761.m6628("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new C5127((C0377) obj);
        }
    }
}
