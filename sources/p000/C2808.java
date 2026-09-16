package p000;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: ۥۦؕٗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2808 implements InterfaceC1981, InterfaceC0891, InterfaceC5641, InterfaceC3463, InterfaceC0468, InterfaceC4895, InterfaceC2003 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C5680 f9373 = new C5680(0);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1068 f9374 = new C1068(1);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C2606 f9375 = new C2606();

    /* JADX INFO: renamed from: ۥْ */
    public Object f9376;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f9377;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f9378;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9379;

    /* JADX WARN: Code duplicated, block: B:82:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Class[], java.lang.Object[], java.lang.Throwable] */
    public C2808(C3088 c3088) {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        char c;
        Icon iconCreateWithBitmap;
        String strM4934;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i2;
        this.f9379 = 22;
        this.f9377 = new Bundle();
        this.f9376 = c3088;
        Context context = c3088.f10359;
        ArrayList arrayList4 = c3088.f10368;
        ArrayList arrayList5 = c3088.f10354;
        ArrayList arrayList6 = c3088.f10360;
        Notification.Builder builder = new Notification.Builder(context, c3088.f10362);
        this.f9378 = builder;
        Notification notification = c3088.f10369;
        Object obj = null;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c3088.f10355).setContentText(c3088.f10356).setContentInfo(null).setContentIntent(c3088.f10366).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(c3088.f10358);
        Iterator it2 = c3088.f10357.iterator();
        while (it2.hasNext()) {
            C2668 c2668 = (C2668) it2.next();
            IconCompat iconCompatM56 = c2668.f8838;
            if (iconCompatM56 == null && (i2 = c2668.f8836) != 0) {
                iconCompatM56 = IconCompat.m56(i2);
                c2668.f8838 = iconCompatM56;
            }
            IconCompat iconCompat = iconCompatM56;
            boolean z = c2668.f8835;
            int i4 = i3;
            Bundle bundle = c2668.f8839;
            if (iconCompat != null) {
                ?? r17 = obj;
                int i5 = iconCompat.f178;
                switch (i5) {
                    case -1:
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        it = it2;
                        c = 2;
                        iconCreateWithBitmap = (Icon) iconCompat.f176;
                        break;
                    case 0:
                    default:
                        C1078.m2272("Unknown type");
                        throw r17;
                    case 1:
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        it = it2;
                        c = 2;
                        iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f176);
                        colorStateList = iconCompat.f182;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f177;
                        if (mode != IconCompat.f172) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        if (i5 == -1) {
                            Object obj2 = iconCompat.f176;
                            arrayList2 = arrayList5;
                            it = it2;
                            if (Build.VERSION.SDK_INT >= 28) {
                                strM4934 = AbstractC2611.m4934(obj2);
                                arrayList3 = arrayList6;
                            } else {
                                try {
                                    arrayList3 = arrayList6;
                                    try {
                                        strM4934 = (String) obj2.getClass().getMethod("getResPackage", r17).invoke(obj2, r17);
                                    } catch (IllegalAccessException e) {
                                        e = e;
                                        Log.e("IconCompat", "Unable to get icon package", e);
                                        strM4934 = null;
                                    } catch (NoSuchMethodException e2) {
                                        e = e2;
                                        Log.e("IconCompat", "Unable to get icon package", e);
                                        strM4934 = null;
                                    } catch (InvocationTargetException e3) {
                                        e = e3;
                                        Log.e("IconCompat", "Unable to get icon package", e);
                                        strM4934 = null;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    arrayList3 = arrayList6;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    arrayList3 = arrayList6;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    arrayList3 = arrayList6;
                                }
                            }
                            c = 2;
                        } else {
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            it = it2;
                            c = 2;
                            if (i5 != 2) {
                                C0178.m390(iconCompat, "called getResPackage() on ");
                                throw null;
                            }
                            String str = iconCompat.f180;
                            strM4934 = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f176).split(":", -1)[i4] : iconCompat.f180;
                        }
                        iconCreateWithBitmap = Icon.createWithResource(strM4934, iconCompat.f174);
                        colorStateList = iconCompat.f182;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f177;
                        if (mode != IconCompat.f172) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                        iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f176, iconCompat.f174, iconCompat.f175);
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        it = it2;
                        c = 2;
                        colorStateList = iconCompat.f182;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f177;
                        if (mode != IconCompat.f172) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case C4261.LONG_FIELD_NUMBER /* 4 */:
                        iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f176);
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        it = it2;
                        c = 2;
                        colorStateList = iconCompat.f182;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f177;
                        if (mode != IconCompat.f172) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case C4261.STRING_FIELD_NUMBER /* 5 */:
                        iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.f176);
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        it = it2;
                        c = 2;
                        colorStateList = iconCompat.f182;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f177;
                        if (mode != IconCompat.f172) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                    case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (Build.VERSION.SDK_INT < 30) {
                            C1078.m2271(iconCompat.m57(), "Context is required to resolve the file uri of the icon: ");
                            throw r17;
                        }
                        iconCreateWithBitmap = AbstractC5604.m9455(iconCompat.m57());
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        it = it2;
                        c = 2;
                        colorStateList = iconCompat.f182;
                        if (colorStateList != null) {
                            iconCreateWithBitmap.setTintList(colorStateList);
                        }
                        mode = iconCompat.f177;
                        if (mode != IconCompat.f172) {
                            iconCreateWithBitmap.setTintMode(mode);
                        }
                        break;
                        break;
                }
            } else {
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
                it = it2;
                c = 2;
                iconCreateWithBitmap = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCreateWithBitmap, c2668.f8837, c2668.f8841);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i4);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                AbstractC2611.m4927(builder2);
            }
            if (i6 >= 29) {
                AbstractC5183.m8792(builder2);
            }
            if (i6 >= 31) {
                AbstractC0797.m1705(builder2);
            }
            if (i6 >= 37) {
                AbstractC1888.m3741(builder2);
                AbstractC1888.m3740(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c2668.f8840);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f9378).addAction(builder2.build());
            arrayList5 = arrayList2;
            it2 = it;
            arrayList6 = arrayList3;
            obj = null;
            i3 = 0;
        }
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = arrayList6;
        Bundle bundle3 = c3088.f10361;
        if (bundle3 != null) {
            ((Bundle) this.f9377).putAll(bundle3);
        }
        ((Notification.Builder) this.f9378).setShowWhen(c3088.f10364);
        ((Notification.Builder) this.f9378).setLocalOnly(c3088.f10365);
        ((Notification.Builder) this.f9378).setGroup(null);
        ((Notification.Builder) this.f9378).setSortKey(null);
        ((Notification.Builder) this.f9378).setGroupSummary(false);
        ((Notification.Builder) this.f9378).setCategory(null);
        ((Notification.Builder) this.f9378).setColor(0);
        ((Notification.Builder) this.f9378).setVisibility(0);
        ((Notification.Builder) this.f9378).setPublicVersion(null);
        ((Notification.Builder) this.f9378).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList7 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList7.size());
                Iterator it3 = arrayList7.iterator();
                if (it3.hasNext()) {
                    throw AbstractC5078.m8675(it3);
                }
            }
            if (arrayList != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList;
                } else {
                    C1821 c1821 = new C1821(arrayList4.size() + arrayList.size());
                    c1821.addAll(arrayList);
                    c1821.addAll(arrayList4);
                    arrayList4 = new ArrayList(c1821);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                ((Notification.Builder) this.f9378).addPerson((String) it4.next());
            }
        }
        if (arrayList8.size() > 0) {
            Bundle bundle4 = c3088.f10361;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                c3088.f10361 = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i7 = 0;
            while (i7 < arrayList8.size()) {
                String string = Integer.toString(i7);
                ArrayList arrayList9 = arrayList8;
                C2668 c2669 = (C2668) arrayList9.get(i7);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatM57 = c2669.f8838;
                if (iconCompatM57 == null && (i = c2669.f8836) != 0) {
                    iconCompatM57 = IconCompat.m56(i);
                    c2669.f8838 = iconCompatM57;
                }
                Bundle bundle9 = c2669.f8839;
                bundle8.putInt("icon", iconCompatM57 != null ? iconCompatM57.m58() : 0);
                bundle8.putCharSequence("title", c2669.f8837);
                bundle8.putParcelable("actionIntent", c2669.f8841);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", c2669.f8835);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c2669.f8840);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i7++;
                arrayList8 = arrayList9;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = c3088.f10361;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                c3088.f10361 = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f9377).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) this.f9378).setExtras(c3088.f10361);
        ((Notification.Builder) this.f9378).setRemoteInputHistory(null);
        ((Notification.Builder) this.f9378).setBadgeIconType(0);
        ((Notification.Builder) this.f9378).setSettingsText(null);
        ((Notification.Builder) this.f9378).setShortcutId(null);
        ((Notification.Builder) this.f9378).setTimeoutAfter(0L);
        ((Notification.Builder) this.f9378).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(c3088.f10362)) {
            ((Notification.Builder) this.f9378).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            Iterator it5 = arrayList7.iterator();
            if (it5.hasNext()) {
                throw AbstractC5078.m8675(it5);
            }
        }
        if (i8 >= 29) {
            AbstractC5183.m8795((Notification.Builder) this.f9378, c3088.f10367);
            AbstractC5183.m8791((Notification.Builder) this.f9378);
        }
        if (i8 >= 36) {
            AbstractC3547.m6348((Notification.Builder) this.f9378);
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static void m5330(C2711 c2711, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            c2711.m5036(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m5331() {
        if (((Boolean) new C3548(0, f9375, C2606.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 1).mo449()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m5332() {
        if (((Boolean) new C3548(0, f9375, C2606.class, "isBlockingThread", "isBlockingThread()Z", 0, 2).mo449()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static String m5333(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return AbstractC3761.m6629(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    @Override // p000.InterfaceC4895
    public Object get() {
        switch (this.f9379) {
            case 11:
                Context context = (Context) ((C3121) this.f9378).f10451;
                InterfaceC3534 interfaceC3534 = (InterfaceC3534) ((InterfaceC5641) this.f9376).get();
                C2171 c2171 = (C2171) ((InterfaceC5641) this.f9377).get();
                return C1397.m2961(c2171, new C4122(new C0091(11, c2171)), AbstractC4009.m7151(interfaceC3534), new C3154(context, 1));
            default:
                return new C2808((Context) ((InterfaceC4895) this.f9378).get(), (C1835) ((InterfaceC4895) this.f9376).get(), (C0450) ((C3223) this.f9377).get(), 16);
        }
    }

    @Override // p000.InterfaceC3463
    public void shutdown() {
        ((ConnectivityManager) this.f9378).unregisterNetworkCallback((C0291) this.f9377);
    }

    public String toString() {
        switch (this.f9379) {
            case 19:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f9376);
                sb.append('{');
                C3369 c3369 = (C3369) ((C3369) this.f9378).f11254;
                String str = "";
                while (c3369 != null) {
                    Object obj = c3369.f11255;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c3369 = (C3369) c3369.f11254;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public AbstractC4766 m5334(C3131 c3131, InterfaceC1796 interfaceC1796, InterfaceC1796 interfaceC1797) {
        String value;
        StringBuilder sb = new StringBuilder(AbstractC2919.m5505(c3131));
        sb.append(':');
        if (interfaceC1796 == null || (value = interfaceC1796.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(interfaceC1797);
        return (AbstractC4766) ((ConcurrentHashMap) this.f9376).get(sb.toString());
    }

    /* JADX INFO: renamed from: ۥً */
    public void m5335(String str) {
        if (str != null) {
            this.f9376 = str;
        } else {
            C0178.m387("Null backendName");
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public int m5336() {
        C2257 c2257 = (C2257) this.f9376;
        if (c2257 == null) {
            c2257 = null;
        }
        if (c2257.f7492.isEmpty()) {
            return 0;
        }
        C2257 c2258 = (C2257) this.f9376;
        if (c2258 == null) {
            c2258 = null;
        }
        int i = ((C3000) AbstractC0973.m2040(c2258.f7492)).f10088;
        C2257 c2259 = (C2257) this.f9376;
        return Math.abs(((i + (c2259 != null ? c2259 : null).f7490) + (c2259 != null ? c2259 : null).f7483) - (c2259 != null ? c2259 : null).f7500);
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m5337(AbstractC0097 abstractC0097) {
        HashSet hashSet = (HashSet) this.f9377;
        ArrayList arrayList = (ArrayList) this.f9376;
        if (arrayList.contains(abstractC0097)) {
            return;
        }
        if (hashSet.contains(abstractC0097)) {
            C0178.m390(hashSet, "Cyclic dependency chain found: ");
            return;
        }
        hashSet.add(abstractC0097);
        abstractC0097.mo8116(this);
        hashSet.remove(abstractC0097);
        if (arrayList.contains(abstractC0097)) {
            return;
        }
        if (C1783.class.isAssignableFrom(abstractC0097.getClass())) {
            arrayList.add(0, abstractC0097);
        } else {
            arrayList.add(abstractC0097);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public boolean m5338(C0605 c0605) {
        return !(c0605.f2271 == null) && (((C5646) ((C5086) this.f9378).f16877).contains(c0605) || ((C5646) ((C5086) this.f9376).f16877).contains(c0605));
    }

    /* JADX INFO: renamed from: ۥْ */
    public boolean m5339() {
        C2257 c2257 = (C2257) this.f9376;
        if (c2257 == null) {
            c2257 = null;
        }
        return !c2257.f7492.isEmpty();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public int m5340() {
        C2257 c2257 = (C2257) this.f9376;
        if (c2257 == null) {
            c2257 = null;
        }
        if (c2257.f7492.isEmpty()) {
            return -1;
        }
        C2257 c2258 = (C2257) this.f9376;
        if (c2258 == null) {
            c2258 = null;
        }
        long j = ((C3000) AbstractC0973.m2040(c2258.f7492)).f10086;
        C2257 c2259 = (C2257) this.f9376;
        long j2 = j + ((long) (c2259 != null ? c2259 : null).f7491);
        long jM5358 = ((long) m5358()) - 1;
        if (j2 > jM5358) {
            j2 = jM5358;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public void m5341(InterfaceC2880 interfaceC2880) {
        ((C2004) this.f9377).f6604.f8016 = interfaceC2880;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public int m5342() {
        C2257 c2257 = (C2257) this.f9376;
        if (c2257 == null) {
            c2257 = null;
        }
        if (c2257.f7492.isEmpty()) {
            return 0;
        }
        C2257 c2258 = (C2257) this.f9376;
        if (c2258 == null) {
            c2258 = null;
        }
        int i = ((C3000) AbstractC0973.m2045(c2258.f7492)).f10088;
        C2257 c2259 = (C2257) this.f9376;
        int i2 = i + (-(c2259 != null ? c2259 : null).f7486);
        return Math.abs(i2 <= 0 ? i2 : 0);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public void m5343(Network network, boolean z) {
        C2358 c2358;
        boolean z2;
        boolean z3 = false;
        for (Network network2 : ((ConnectivityManager) this.f9378).getAllNetworks()) {
            if (AbstractC3831.m6874(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f9378).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        ComponentCallbacks2C2386 componentCallbacks2C2386 = (ComponentCallbacks2C2386) this.f9376;
        synchronized (componentCallbacks2C2386) {
            try {
                if (((C1199) componentCallbacks2C2386.f7916.get()) != null) {
                    componentCallbacks2C2386.f7912 = z3;
                    c2358 = C2358.f7817;
                } else {
                    c2358 = null;
                }
                if (c2358 == null) {
                    componentCallbacks2C2386.m4462();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public void m5344(String str, String str2) {
        ((HashMap) this.f9377).put(str, str2);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C1360 m5345() {
        String strConcat = ((String) this.f9376) == null ? " backendName" : "";
        if (((EnumC4021) this.f9377) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C1360((String) this.f9376, (byte[]) this.f9378, (EnumC4021) this.f9377);
        }
        C1078.m2276("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public void m5346(EnumC2459 enumC2459) {
        ((C2004) this.f9377).f6604.f8015 = enumC2459;
    }

    @Override // p000.InterfaceC3463
    /* JADX INFO: renamed from: ۥۜ */
    public boolean mo5347() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9378;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m5348(int i, C0605 c0605) {
        C5086 c5086 = (C5086) this.f9378;
        C5086 c5087 = (C5086) this.f9376;
        C5086 c5088 = (C5086) this.f9377;
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            c5086.m8704(c0605);
            c5088.m8704(c0605);
            return;
        }
        if (iM6632 == 1) {
            c5087.m8704(c0605);
            c5088.m8704(c0605);
            return;
        }
        if (iM6632 == 2) {
            if (c0605.f2271 != null) {
                c5088.m8704(c0605);
                return;
            } else {
                c5086.m8704(c0605);
                return;
            }
        }
        if (iM6632 != 3) {
            C1078.m2275();
        } else if (c0605.f2271 != null) {
            c5088.m8704(c0605);
        } else {
            c5087.m8704(c0605);
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void m5349(C1360 c1360, int i, boolean z) {
        C0450 c0450 = (C0450) this.f9377;
        Context context = (Context) this.f9378;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = c1360.f4676;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC4021 enumC4021 = c1360.f4674;
        adler32.update(byteBufferAllocate.putInt(AbstractC3020.m5614(enumC4021)).array());
        byte[] bArr = c1360.f4675;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i2 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i2 < i) {
                        break;
                    }
                    C3133.m5807("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c1360);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((C1835) this.f9376).m3610().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC3020.m5614(enumC4021))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c0450.m973(enumC4021, jLongValue, i));
            Set set = ((C5526) c0450.f1642.get(enumC4021)).f18243;
            if (set.contains(EnumC2063.f6792)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC2063.f6789)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC2063.f6791)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC3020.m5614(enumC4021));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c1360, Integer.valueOf(value), Long.valueOf(c0450.m973(enumC4021, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public void m5350() {
        C3262 c3262 = (C3262) this.f9378;
        String str = (String) this.f9376;
        List list = (List) c3262.m6026(str);
        if (list != null) {
            list.remove((InterfaceC4448) this.f9377);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c3262.m6023(str, list);
    }

    /* JADX INFO: renamed from: ۦؙ */
    public void m5351(long j) {
        ((C2004) this.f9377).f6604.f8017 = j;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public void m5352(int i) {
        Toast.makeText((Application) this.f9376, AbstractC4009.m7184(i, new Object[0]), 0).show();
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: renamed from: ۦٌ */
    public InterfaceC3212 m5353() {
        return ((C2004) this.f9377).f6604.f8014;
    }

    @Override // p000.InterfaceC2003
    /* JADX INFO: renamed from: ۦِ */
    public Object mo804(Object obj) {
        C1039 c1039 = (C1039) this.f9377;
        C0822 c0822 = (C0822) this.f9378;
        String strM2034 = ((C0971) c1039.f3672).m2034((InterfaceC4734) this.f9376, obj);
        Charset charset = AbstractC4637.f15306;
        Pattern pattern = C0822.f2914;
        C0822 c0822M9040 = null;
        Charset charsetM1719 = c0822.m1719(null);
        if (charsetM1719 == null) {
            try {
                c0822M9040 = AbstractC5378.m9040(c0822 + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            c0822 = c0822M9040;
        } else {
            charset = charsetM1719;
        }
        byte[] bytes = strM2034.getBytes(charset);
        int length = bytes.length;
        AbstractC4031.m7219(bytes.length, 0L, length);
        return new C4909(c0822, length, bytes);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public boolean m5354() {
        return !(((C5646) ((C5086) this.f9378).f16877).isEmpty() && ((C5646) ((C5086) this.f9377).f16877).isEmpty() && ((C5646) ((C5086) this.f9376).f16877).isEmpty());
    }

    /* JADX INFO: renamed from: ۦٗ */
    public long m5355() {
        return ((C2004) this.f9377).f6604.f8017;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public void m5356(InterfaceC3212 interfaceC3212) {
        ((C2004) this.f9377).f6604.f8014 = interfaceC3212;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public C1762 m5357() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        m5332();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strM5333 = m5333((String) this.f9376, (HashMap) this.f9378);
            String strConcat = "GET Request URL: ".concat(strM5333);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strConcat, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strM5333).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.f9377).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new C1762(responseCode, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    @Override // p000.InterfaceC0891
    /* JADX INFO: renamed from: ۦۗ */
    public void mo1882(Bundle bundle) {
        synchronized (this.f9376) {
            try {
                C1397 c1397 = C1397.f4781;
                c1397.m2966("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f9377 = new CountDownLatch(1);
                ((C5086) this.f9378).mo1882(bundle);
                c1397.m2966("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f9377).await(500L, TimeUnit.MILLISECONDS)) {
                        c1397.m2966("App exception callback received from Analytics listener.");
                    } else {
                        c1397.m2968("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f9377 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1981
    /* JADX INFO: renamed from: ۦۚ */
    public void mo3870(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f9377;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public int m5358() {
        return ((Number) ((C0101) this.f9378).mo449()).intValue();
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public int m5359() {
        C2257 c2257 = (C2257) this.f9376;
        if (c2257 == null) {
            c2257 = null;
        }
        if (c2257.f7492.isEmpty()) {
            return -1;
        }
        C2257 c2258 = (C2257) this.f9376;
        if (c2258 == null) {
            c2258 = null;
        }
        long j = ((C3000) AbstractC0973.m2045(c2258.f7492)).f10086;
        C2257 c2259 = (C2257) this.f9376;
        long j2 = j - ((long) (c2259 != null ? c2259 : null).f7491);
        if (j2 < 0) {
            j2 = 0;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public C5668 m5360() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C3223) this.f9377)) {
            try {
                C5668 c5668 = (C5668) this.f9376;
                if (c5668 != null && localeList == ((LocaleList) this.f9378)) {
                    return c5668;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C0620(localeList.get(i)));
                }
                C5668 c5669 = new C5668(arrayList);
                this.f9378 = localeList;
                this.f9376 = c5669;
                return c5669;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C2808(Object obj, Object obj2, Object obj3, int i) {
        this.f9379 = i;
        this.f9378 = obj;
        this.f9376 = obj2;
        this.f9377 = obj3;
    }

    public C2808(ArrayList arrayList) {
        this.f9379 = 26;
        this.f9378 = arrayList;
        this.f9376 = new ArrayList(arrayList.size());
        this.f9377 = new HashSet(3);
    }

    public C2808(C2527 c2527) {
        this.f9379 = 21;
        this.f9378 = new C5592(0);
        this.f9376 = new C1414(0);
        this.f9377 = new C1225(17, this, c2527);
    }

    public C2808(ExecutorService executorService, ExecutorService executorService2) {
        this.f9379 = 1;
        this.f9378 = new ExecutorC2291(executorService);
        this.f9376 = new ExecutorC2291(executorService);
        AbstractC5378.m9075(null);
        this.f9377 = new ExecutorC2291(executorService2);
    }

    public C2808(int i) {
        this.f9379 = i;
        switch (i) {
            case 10:
                this.f9378 = new C5086(19);
                this.f9376 = new C5086(19);
                this.f9377 = new C5086(19);
                break;
            case 20:
                String string = UUID.randomUUID().toString();
                C1007 c1007 = new C1007(string.getBytes(AbstractC4637.f15306));
                c1007.f3596 = string;
                this.f9378 = c1007;
                this.f9376 = C1528.f5174;
                this.f9377 = new ArrayList();
                break;
            case 24:
                long[] jArr = AbstractC5064.f16815;
                this.f9378 = new C3262();
                break;
            default:
                this.f9377 = new C3223(29);
                break;
        }
    }

    public C2808(String str, HashMap map) {
        this.f9379 = 12;
        this.f9376 = str;
        this.f9378 = map;
        this.f9377 = new HashMap();
    }

    public C2808(C1414 c1414) {
        this.f9379 = 15;
        this.f9378 = c1414;
        this.f9376 = new ConcurrentHashMap();
        this.f9377 = new ConcurrentHashMap();
    }

    public C2808(C5086 c5086) {
        this.f9379 = 4;
        this.f9376 = new Object();
        this.f9378 = c5086;
    }

    public C2808(C2711 c2711) {
        this.f9379 = 0;
        this.f9376 = null;
        this.f9377 = null;
        this.f9378 = c2711;
    }

    public C2808(View view) {
        this.f9379 = 14;
        this.f9378 = view;
        this.f9376 = AbstractC3933.m7095(3, new C5285(11, this));
        this.f9377 = new C1039(view);
    }

    public C2808(C0101 c0101) {
        this.f9379 = 23;
        this.f9378 = c0101;
    }

    public /* synthetic */ C2808(int i, boolean z) {
        this.f9379 = i;
    }

    public C2808(C2004 c2004) {
        this.f9379 = 5;
        this.f9377 = c2004;
        this.f9378 = new C5086(10, this);
    }

    public C2808(Runnable runnable) {
        this.f9379 = 18;
        this.f9376 = new CopyOnWriteArrayList();
        this.f9377 = new HashMap();
        this.f9378 = runnable;
    }

    public C2808(ConnectivityManager connectivityManager, ComponentCallbacks2C2386 componentCallbacks2C2386) {
        this.f9379 = 25;
        this.f9378 = connectivityManager;
        this.f9376 = componentCallbacks2C2386;
        C0291 c0291 = new C0291(2, this);
        this.f9377 = c0291;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), c0291);
    }

    public C2808(Context context) {
        this.f9379 = 13;
        this.f9378 = context.getApplicationContext();
        this.f9376 = AbstractC0040.f7816;
        this.f9377 = new C4036(13);
    }

    public C2808(String str) {
        this.f9379 = 19;
        C3369 c3369 = new C3369(14, false);
        this.f9378 = c3369;
        this.f9377 = c3369;
        this.f9376 = str;
    }

    public C2808(URL url, C1134 c1134, String str) {
        this.f9379 = 6;
        this.f9378 = url;
        this.f9377 = c1134;
        this.f9376 = str;
    }
}
