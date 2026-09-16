package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۦٞؕۚۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4804 implements InterfaceC3077 {

    /* JADX INFO: renamed from: ۥْ */
    public volatile int f15843 = -1;

    /* JADX INFO: renamed from: ۥٓ */
    public C0352 f15844;

    /* JADX INFO: renamed from: ۦ۟ */
    public final C3225 f15845;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f15846;

    public AbstractC4804(String str, C3225 c3225) {
        this.f15846 = str;
        this.f15845 = c3225;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    @Override // p000.InterfaceC3077
    public final Object get() {
        C3001 c3001M5953;
        Object objMo6420;
        C0796 c0796;
        C0996 c0996;
        if (AbstractC3925.f13096 == null) {
            Object obj = C0996.f3556;
            AbstractC3925.f13096 = new C3754(5);
        }
        Context context = (Context) C0996.f3557.get();
        Object objMo6417 = null;
        if (context == null) {
            synchronized (AbstractC3925.f13100) {
            }
            C1078.m2276("Must call PhenotypeContext.setContext() first");
            return null;
        }
        C0996 c0997 = C0996.f3554;
        if (c0997 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                Class<?> cls = applicationContext.getApplicationContext().getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (C0996.f3556) {
                    try {
                        if (C0996.f3554 != null) {
                            c0996 = C0996.f3554;
                        } else {
                            c0996 = (C0996) new C0272(applicationContext, 2).get();
                            C0996.f3554 = c0996;
                            AbstractC1631.m3424(Level.CONFIG, c0996.m2177(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        c0997 = c0996;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.f15843;
        if (i == -1 || i < this.f15844.f1284.get()) {
            synchronized (this) {
                try {
                    int i2 = this.f15843;
                    if (i2 == -1) {
                        C0996.m2176();
                        c0997.getClass();
                        c3001M5953 = this.f15845.m5953(c0997);
                        this.f15844 = c3001M5953.f10096;
                    } else {
                        c3001M5953 = null;
                    }
                    int i3 = this.f15844.f1284.get();
                    if (i2 < i3) {
                        C0996.m2176();
                        c0997.getClass();
                        AbstractC3538 abstractC3538M3423 = AbstractC1631.m3423(c0997.f3561);
                        if (abstractC3538M3423.mo3984()) {
                            C4270 c4270 = (C4270) abstractC3538M3423.mo3985();
                            Uri uriM7685 = AbstractC4385.m7685();
                            String str = this.f15846;
                            if (uriM7685 != null) {
                                c0796 = (C0796) c4270.f14134.get(uriM7685.toString());
                            } else {
                                c4270.getClass();
                                c0796 = null;
                            }
                            String str2 = c0796 == null ? null : (String) c0796.get(str);
                            if (str2 == null) {
                                objMo6420 = null;
                            } else {
                                try {
                                    objMo6420 = mo6419(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f15846), e);
                                    objMo6420 = null;
                                }
                            }
                        } else {
                            objMo6420 = null;
                        }
                        if (c3001M5953 == null) {
                            c3001M5953 = this.f15845.m5953(c0997);
                        }
                        String str3 = c3001M5953.f10094;
                        if (!c0997.f3561.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            InterfaceFutureC4378 interfaceFutureC4378M6287 = c0997.m2177().m6287(new RunnableC5413(10, c0997, str3));
                            interfaceFutureC4378M6287.mo3760(new RunnableC3365(25, interfaceFutureC4378M6287), EnumC0486.f1767);
                        }
                        Object obj2 = ((C5147) c3001M5953.m5592().f15688).get(this.f15846);
                        if (obj2 != null) {
                            try {
                                objMo6417 = mo6417(obj2);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f15846), e2);
                            }
                        }
                        if (true != abstractC3538M3423.mo3984()) {
                            objMo6420 = objMo6417;
                        }
                        if (objMo6420 == null) {
                            objMo6420 = mo6420();
                        }
                        if (objMo6420 != null) {
                            mo6418(objMo6420);
                            this.f15843 = i3;
                        }
                    } else {
                        objMo6420 = mo6421();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objMo6420 = mo6421();
        }
        objMo6420.getClass();
        return objMo6420;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract Object mo6417(Object obj);

    /* JADX INFO: renamed from: ۥُ */
    public abstract void mo6418(Object obj);

    /* JADX INFO: renamed from: ۥۗ */
    public abstract Object mo6419(String str);

    /* JADX INFO: renamed from: ۥۣ */
    public abstract Object mo6420();

    /* JADX INFO: renamed from: ۦؑ */
    public abstract Object mo6421();
}
