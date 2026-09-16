package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC0684;
import p000.AbstractC0973;
import p000.AbstractC3925;
import p000.AbstractC4009;
import p000.AbstractC5041;
import p000.AbstractC5378;
import p000.AbstractC5551;
import p000.C1340;
import p000.C1865;
import p000.C1940;
import p000.C1967;
import p000.C2244;
import p000.C2432;
import p000.C2749;
import p000.C3121;
import p000.C3369;
import p000.C3657;
import p000.C4229;
import p000.C4535;
import p000.InterfaceC0504;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerDelegate_ru_bluecat_yandexmapspatcher implements Handler.Callback {
    public static final int $stable = 8;
    private final Handler.Callback baseInstance;

    public HandlerDelegate_ru_bluecat_yandexmapspatcher(Handler.Callback callback) {
        this.baseInstance = callback;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be  */
    /* JADX WARN: Code duplicated, block: B:98:0x0216  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws IllegalAccessException {
        Bundle bundle;
        Object c4535;
        List list;
        Bundle bundle2;
        Object c4536;
        Object c4537;
        Parcelable parcelable;
        Object c4538;
        Object c4539;
        C1340 c1340 = C1340.f4625;
        Handler.Callback callback = this.baseInstance;
        c1340.getClass();
        InterfaceC0504[] interfaceC0504Arr = C1340.f4624;
        int i = message.what;
        if (i == 100) {
            C3121 c3121M7163 = AbstractC4009.m7163(message.obj);
            C2432 c2432 = C1940.f6401;
            ((C4229) c3121M7163.f10451).f14027 = AbstractC3925.m7053();
            c3121M7163.m5746();
            C2749 c2749M5747 = c3121M7163.m5747();
            c2749M5747.f9027 = "intent";
            C1865 c1865 = (C1865) AbstractC0973.m2058(c2749M5747.m5108());
            Intent intent = c1865 != null ? (Intent) c1865.m3715() : null;
            C1865 c1866 = (C1865) C1340.f4623.getValue();
            if (c1866 != null) {
                C1865 c1867 = new C1865(c1866.f6208);
                c1867.m5666(intent);
                try {
                    c4535 = c1867.m3715();
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                if (c4535 instanceof C4535) {
                    c4535 = null;
                }
                bundle = (Bundle) c4535;
            } else {
                bundle = null;
            }
            if (bundle != null) {
                C1967.f6501.getClass();
                Application applicationM3850 = C1967.m3850();
                bundle.setClassLoader(applicationM3850 != null ? applicationM3850.getClassLoader() : null);
            }
            if (intent != null && intent.hasExtra("")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("");
                c1865.m3377();
                c1865.f6208.set(c1865.f10320, parcelableExtra);
            }
        } else if (i == 159) {
            C3369 c3369 = C1340.f4626;
            InterfaceC0504 interfaceC0504 = interfaceC0504Arr[1];
            C4229 c4229 = new C4229(c3369.m6138(), null, 1);
            C2432 c2433 = C1940.f6401;
            c4229.f14027 = AbstractC3925.m7053();
            c4229.f14028 = 3;
            C2244 c2244 = new C2244();
            c2244.f9028 = c4229;
            c2244.f9027 = "getCallbacks";
            C3657 c3657 = (C3657) AbstractC0973.m2058(c2244.m4293());
            if (c3657 != null) {
                c3657.m5666(message.obj);
                try {
                    c4539 = c3657.m6535(Arrays.copyOf(new Object[0], 0));
                } catch (Throwable th2) {
                    c4539 = new C4535(th2);
                }
                if (c4539 instanceof C4535) {
                    c4539 = null;
                }
                list = (List) c4539;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC0684.m1527(obj.getClass().getName(), "LaunchActivityItem", false)) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3121 c3121M7164 = AbstractC4009.m7163(it.next());
                    c3121M7164.m5746();
                    C2749 c2749M5748 = c3121M7164.m5747();
                    c2749M5748.f9027 = "mIntent";
                    C1865 c1868 = (C1865) AbstractC0973.m2058(c2749M5748.m5108());
                    Intent intent2 = c1868 != null ? (Intent) c1868.m3715() : null;
                    C1340.f4625.getClass();
                    C1865 c1869 = (C1865) C1340.f4623.getValue();
                    if (c1869 != null) {
                        C1865 c18610 = new C1865(c1869.f6208);
                        c18610.m5666(intent2);
                        try {
                            c4538 = c18610.m3715();
                        } catch (Throwable th3) {
                            c4538 = new C4535(th3);
                        }
                        if (c4538 instanceof C4535) {
                            c4538 = null;
                        }
                        bundle2 = (Bundle) c4538;
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        C1967.f6501.getClass();
                        Application applicationM3851 = C1967.m3850();
                        bundle2.setClassLoader(applicationM3851 != null ? applicationM3851.getClassLoader() : null);
                    }
                    if (intent2 != null && intent2.hasExtra("")) {
                        Class<Intent> clsM9037 = AbstractC5378.m9037(AbstractC5041.m8557(Intent.class));
                        Class cls = clsM9037 != null ? clsM9037 : Intent.class;
                        int i2 = AbstractC5551.f18327;
                        Parcelable parcelableExtra2 = intent2.getParcelableExtra("");
                        if (parcelableExtra2 == null) {
                            parcelableExtra2 = null;
                        }
                        int i3 = AbstractC5551.f18327;
                        if (i3 >= 33 && (parcelable = (Parcelable) intent2.getParcelableExtra("", cls)) != null) {
                            parcelableExtra2 = parcelable;
                        }
                        Intent intent3 = (Intent) parcelableExtra2;
                        if (i3 >= 31) {
                            C3369 c33610 = C1340.f4622;
                            InterfaceC0504 interfaceC0505 = interfaceC0504Arr[0];
                            C3121 c3121M7158 = AbstractC4009.m7158(c33610.m6138());
                            C2432 c2434 = C1940.f6401;
                            ((C4229) c3121M7158.f10451).f14027 = AbstractC3925.m7053();
                            c3121M7158.m5746();
                            C2244 c2244M5751 = c3121M7158.m5751();
                            c2244M5751.f9027 = "currentActivityThread";
                            C3657 c3658 = (C3657) AbstractC0973.m2058(c2244M5751.m4293());
                            Object objM6534 = c3658 != null ? c3658.m6534(new Object[0]) : null;
                            C3121 c3121M7165 = AbstractC4009.m7163(message.obj);
                            ((C4229) c3121M7165.f10451).f14027 = AbstractC3925.m7053();
                            c3121M7165.m5746();
                            C2244 c2244M5752 = c3121M7165.m5751();
                            c2244M5752.f9027 = "getActivityToken";
                            C3657 c3659 = (C3657) AbstractC0973.m2058(c2244M5752.m4293());
                            if (c3659 != null) {
                                try {
                                    c4536 = c3659.m6534(Arrays.copyOf(new Object[0], 0));
                                } catch (Throwable th4) {
                                    c4536 = new C4535(th4);
                                }
                                if (c4536 instanceof C4535) {
                                    c4536 = null;
                                }
                            } else {
                                c4536 = null;
                            }
                            if (objM6534 != null) {
                                C3121 c3121M7166 = AbstractC4009.m7163(objM6534);
                                ((C4229) c3121M7166.f10451).f14027 = AbstractC3925.m7053();
                                c3121M7166.m5746();
                                C2244 c2244M5753 = c3121M7166.m5751();
                                c2244M5753.f9027 = "getLaunchingActivity";
                                c2244M5753.f7447.addAll(Arrays.asList(Arrays.copyOf(new Object[]{AbstractC5041.m8557(IBinder.class)}, 1)));
                                C3657 c36510 = (C3657) AbstractC0973.m2058(c2244M5753.m4293());
                                if (c36510 != null) {
                                    try {
                                        c4537 = c36510.m6534(Arrays.copyOf(new Object[]{c4536}, 1));
                                    } catch (Throwable th5) {
                                        c4537 = new C4535(th5);
                                    }
                                    if (c4537 instanceof C4535) {
                                        c4537 = null;
                                    }
                                } else {
                                    c4537 = null;
                                }
                            } else {
                                c4537 = null;
                            }
                            if (c4537 != null) {
                                C3121 c3121M7167 = AbstractC4009.m7163(c4537);
                                ((C4229) c3121M7167.f10451).f14027 = AbstractC3925.m7053();
                                c3121M7167.m5746();
                                C2749 c2749M5749 = c3121M7167.m5747();
                                c2749M5749.f9027 = "intent";
                                C1865 c18611 = (C1865) AbstractC0973.m2058(c2749M5749.m5108());
                                if (c18611 != null) {
                                    c18611.m3377();
                                    c18611.f6208.set(c18611.f10320, intent3);
                                }
                            }
                        }
                        c1868.m3377();
                        c1868.f6208.set(c1868.f10320, intent3);
                    }
                }
            }
        }
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
