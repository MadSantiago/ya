package p000;

import android.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: ۥٍؓؕٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0322 implements InterfaceC1861 {

    /* JADX INFO: renamed from: ۥْ */
    public Object f1178;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f1179;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1180;

    public C0322(int i, byte b) {
        this.f1180 = i;
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                this.f1179 = 0;
                this.f1178 = new SparseArray();
                break;
            case 10:
                this.f1178 = new LinkedHashMap();
                break;
            default:
                this.f1179 = 0;
                this.f1178 = new StringBuilder();
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m682(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = AbstractC3831.m6879(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public String toString() {
        switch (this.f1180) {
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return AbstractC5078.m8670(this.f1179, "Args of index ");
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            default:
                return super.toString();
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new String((char[]) this.f1178, 0, this.f1179);
        }
    }

    /* JADX INFO: renamed from: ۥؓ */
    public void m683() {
        m684(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public void m684(Serializable serializable) {
        C0954 c0954 = (C0954) this.f1178;
        int i = this.f1179;
        if (i < 0) {
            C1078.m2276("HookParam Method args index must be >= 0");
            return;
        }
        if (c0954.m1971().length == 0) {
            C1078.m2276("HookParam Method args is empty, mabe not has args");
            return;
        }
        if (i > c0954.m1971().length - 1) {
            throw new IllegalStateException(("HookParam Method args index out of bounds, max is " + (c0954.m1971().length - 1)).toString());
        }
        Object[] objArrM3003 = c0954.f3387.m3003();
        if (objArrM3003 != null) {
            objArrM3003[i] = serializable;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public void m685(long j) {
        if (m689(j)) {
            return;
        }
        int i = this.f1179;
        long[] jArrCopyOf = (long[]) this.f1178;
        if (i >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i + 1, jArrCopyOf.length * 2));
            this.f1178 = jArrCopyOf;
        }
        jArrCopyOf[i] = j;
        if (i >= this.f1179) {
            this.f1179 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public void m686(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        m701(this.f1179, length);
        str.getChars(0, str.length(), (char[]) this.f1178, this.f1179);
        this.f1179 += length;
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۥَ */
    public AbstractC1814 mo687(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return ((C1489) this.f1178).mo687(j, abstractC1814, abstractC1815, abstractC1816);
    }

    /* JADX INFO: renamed from: ۥُ */
    public void m688() {
        this.f1179 = 0;
        Iterator it = ((LinkedHashMap) this.f1178).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C1457 c1457 = (C1457) AbstractC0973.m2058(arrayList);
                if ((c1457 != null ? (Bitmap) c1457.f4967.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((C1457) arrayList.get(i3)).f4967.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public boolean m689(long j) {
        int i = this.f1179;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.f1178)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: ۥْ */
    public Object m690(C1531 c1531, AbstractC2870 abstractC2870) {
        C1970 c1970;
        LinkedHashMap linkedHashMap;
        C1531 c1532;
        byte bM7000;
        C0322 c0322;
        C3915 c3915;
        C3915 c3916 = (C3915) this.f1178;
        if (abstractC2870 instanceof C1970) {
            c1970 = (C1970) abstractC2870;
            int i = c1970.f6525;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1970.f6525 = i - Integer.MIN_VALUE;
            } else {
                c1970 = new C1970(this, abstractC2870);
            }
        } else {
            c1970 = new C1970(this, abstractC2870);
        }
        Object obj = c1970.f6526;
        int i2 = c1970.f6525;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = c1970.f6529;
            String str = c1970.f6528;
            linkedHashMap = c1970.f6524;
            c0322 = c1970.f6522;
            c1532 = c1970.f6523;
            AbstractC0186.m409(obj);
            linkedHashMap.put(str, (AbstractC0695) obj);
            bM7000 = ((C3915) c0322.f1178).m7000();
            if (bM7000 == 4) {
                i3 = i4;
                this = c0322;
            } else if (bM7000 != 7) {
                C3915.m6997((C3915) c0322.f1178, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            c3915 = (C3915) c0322.f1178;
            if (bM7000 == 6) {
                c3915.m7001((byte) 7);
            } else if (bM7000 == 4) {
                AbstractC3801.m6765(c3915);
                throw null;
            }
            return new C2945(linkedHashMap);
        }
        AbstractC0186.m409(obj);
        byte bM7001 = c3916.m7001((byte) 6);
        if (c3916.m7016() == 4) {
            C3915.m6997(c3916, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        c1532 = c1531;
        bM7000 = bM7001;
        C3915 c3917 = (C3915) this.f1178;
        if (!c3917.m7005()) {
            c0322 = this;
            c3915 = (C3915) c0322.f1178;
            if (bM7000 == 6) {
                c3915.m7001((byte) 7);
            } else if (bM7000 == 4) {
                AbstractC3801.m6765(c3915);
                throw null;
            }
            return new C2945(linkedHashMap);
        }
        String strM7011 = c3917.m7011();
        c3917.m7001((byte) 5);
        c1970.f6523 = c1532;
        c1970.f6522 = this;
        c1970.f6524 = linkedHashMap;
        c1970.f6528 = strM7011;
        c1970.f6529 = i3;
        c1970.f6525 = 1;
        c1532.f5187 = c1970;
        return EnumC2282.f7590;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public AbstractC1020 m691(boolean z) {
        C3915 c3915 = (C3915) this.f1178;
        String strM7010 = !z ? c3915.m7010() : c3915.m7011();
        return (z || !AbstractC3831.m6874(strM7010, "null")) ? new C0173(strM7010, z) : C0437.INSTANCE;
    }

    @Override // p000.InterfaceC1861
    /* JADX INFO: renamed from: ۥٖ */
    public int mo692() {
        return this.f1179;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public synchronized void m693(C5772 c5772, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1178;
            Object arrayList = linkedHashMap.get(c5772);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c5772, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C1457 c1457 = new C1457(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(c1457);
                    break;
                }
                C1457 c1458 = (C1457) arrayList2.get(i2);
                if (i >= c1458.f4969) {
                    if (c1458.f4968 != iIdentityHashCode || c1458.f4967.get() != bitmap) {
                        arrayList2.add(i2, c1457);
                        break;
                    } else {
                        arrayList2.set(i2, c1457);
                        break;
                    }
                }
                i2++;
            }
            int i3 = this.f1179;
            this.f1179 = i3 + 1;
            if (i3 >= 10) {
                m688();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public void m694() {
        m684(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public Object m695() {
        Object c4535;
        try {
            c4535 = ((C0954) this.f1178).m1971()[this.f1179];
            if (c4535 == null) {
                c4535 = null;
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (c4535 instanceof C4535) {
            return null;
        }
        return c4535;
    }

    @Override // p000.InterfaceC1861
    /* JADX INFO: renamed from: ۦؚ */
    public int mo696() {
        return 0;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m697(C0956 c0956, int i, int i2) {
        ((C3352) this.f1178).m6117(new C0448(c0956), i, i2);
    }

    /* JADX INFO: renamed from: ۦِ */
    public synchronized C2540 m698(int i) {
        C2540 c2540;
        try {
            SparseArray sparseArray = (SparseArray) ((SparseArray) this.f1178).get(Binder.getCallingPid());
            if (sparseArray == null) {
                throw new IOException("Requested file was not opened!");
            }
            c2540 = (C2540) sparseArray.get(i);
            if (c2540 == null) {
                throw new IOException("Requested file was not opened!");
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2540;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void m699(long j) {
        int i = this.f1179;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.f1178)[i2]) {
                int i3 = this.f1179 - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.f1178;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.f1179--;
                return;
            }
            i2++;
        }
    }

    @Override // p000.InterfaceC2707
    /* JADX INFO: renamed from: ۦٗ */
    public AbstractC1814 mo700(long j, AbstractC1814 abstractC1814, AbstractC1814 abstractC1815, AbstractC1814 abstractC1816) {
        return ((C1489) this.f1178).mo700(j, abstractC1814, abstractC1815, abstractC1816);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m701(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f1178;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f1178 = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public boolean m702() {
        return this.f1179 < ((ArrayList) this.f1178).size();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public DialogInterfaceC4964 m703() {
        C0859 c0859 = (C0859) this.f1178;
        ContextThemeWrapper contextThemeWrapper = c0859.f3173;
        DialogInterfaceC4964 dialogInterfaceC4964 = new DialogInterfaceC4964(contextThemeWrapper, this.f1179);
        View view = c0859.f3169;
        C4865 c4865 = dialogInterfaceC4964.f16417;
        if (view != null) {
            c4865.f16020 = view;
        } else {
            CharSequence charSequence = c0859.f3174;
            if (charSequence != null) {
                c4865.f16012 = charSequence;
                TextView textView = c4865.f16013;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0859.f3168;
            if (drawable != null) {
                c4865.f16015 = drawable;
                ImageView imageView = c4865.f16018;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c4865.f16018.setImageDrawable(drawable);
                }
            }
        }
        if (c0859.f3177 != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0859.f3171.inflate(c4865.f16006, (ViewGroup) null);
            int i = c0859.f3176 ? c4865.f16002 : c4865.f16007;
            ListAdapter c1196 = c0859.f3177;
            if (c1196 == null) {
                c1196 = new C1196(contextThemeWrapper, i, R.id.text1, null);
            }
            c4865.f16023 = c1196;
            c4865.f16022 = c0859.f3175;
            if (c0859.f3172 != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1975(c0859, c4865));
            }
            if (c0859.f3176) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c4865.f16003 = alertController$RecycleListView;
        }
        dialogInterfaceC4964.setCancelable(true);
        dialogInterfaceC4964.setCanceledOnTouchOutside(true);
        dialogInterfaceC4964.setOnCancelListener(null);
        dialogInterfaceC4964.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC2273 dialogInterfaceOnKeyListenerC2273 = c0859.f3170;
        if (dialogInterfaceOnKeyListenerC2273 != null) {
            dialogInterfaceC4964.setOnKeyListener(dialogInterfaceOnKeyListenerC2273);
        }
        return dialogInterfaceC4964;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public synchronized int m704(C2540 c2540) {
        int i;
        try {
            int callingPid = Binder.getCallingPid();
            SparseArray sparseArray = (SparseArray) ((SparseArray) this.f1178).get(callingPid);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                ((SparseArray) this.f1178).put(callingPid, sparseArray);
            }
            i = this.f1179;
            this.f1179 = i + 1;
            sparseArray.append(i, c2540);
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m705() {
        C2622 c2622 = C2622.f8724;
        char[] cArr = (char[]) this.f1178;
        synchronized (c2622) {
            int i = c2622.f8725;
            if (cArr.length + i < AbstractC2287.f7596) {
                c2622.f8725 = i + cArr.length;
                c2622.f8726.addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public C5832 m706() {
        C3915 c3915 = (C3915) this.f1178;
        byte bM7000 = c3915.m7000();
        if (c3915.m7016() == 4) {
            C3915.m6997(c3915, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c3915.m7005()) {
            arrayList.add(m707());
            bM7000 = c3915.m7000();
            if (bM7000 != 4) {
                boolean z = bM7000 == 9;
                int i = c3915.f13054;
                if (!z) {
                    C3915.m6997(c3915, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bM7000 == 8) {
            c3915.m7001((byte) 9);
        } else if (bM7000 == 4) {
            AbstractC3801.m6756(c3915, "array");
            throw null;
        }
        return new C5832(arrayList);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public AbstractC0695 m707() {
        AbstractC0695 c2945;
        Object obj;
        C3915 c3915 = (C3915) this.f1178;
        byte bM7016 = c3915.m7016();
        if (bM7016 == 1) {
            return m691(true);
        }
        if (bM7016 == 0) {
            return m691(false);
        }
        if (bM7016 != 6) {
            if (bM7016 == 8) {
                return m706();
            }
            C3915.m6997(c3915, "Cannot read Json element because of unexpected ".concat(AbstractC4554.m7890(bM7016)), 0, null, 6);
            throw null;
        }
        int i = this.f1179 + 1;
        this.f1179 = i;
        if (i == 200) {
            C3807 c3807 = new C3807(this, null);
            C1531 c1531 = new C1531();
            c1531.f5188 = c3807;
            c1531.f5187 = c1531;
            EnumC2282 enumC2282 = EnumC2282.f7590;
            c1531.f5186 = enumC2282;
            while (true) {
                obj = c1531.f5186;
                InterfaceC0443 interfaceC0443 = c1531.f5187;
                if (interfaceC0443 == null) {
                    break;
                }
                if (enumC2282.equals(obj)) {
                    try {
                        C3807 c3808 = c1531.f5188;
                        AbstractC3801.m6782(3, c3808);
                        C3807 c3809 = new C3807(c3808.f12634, interfaceC0443);
                        c3809.f12636 = c1531;
                        Object objMo218 = c3809.mo218(C2358.f7817);
                        if (objMo218 != enumC2282) {
                            interfaceC0443.mo335(objMo218);
                        }
                    } catch (Throwable th) {
                        interfaceC0443.mo335(new C4535(th));
                    }
                } else {
                    c1531.f5186 = enumC2282;
                    interfaceC0443.mo335(obj);
                }
            }
            AbstractC0186.m409(obj);
            c2945 = (AbstractC0695) obj;
        } else {
            byte bM7001 = c3915.m7001((byte) 6);
            if (c3915.m7016() == 4) {
                C3915.m6997(c3915, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (c3915.m7005()) {
                String strM7011 = c3915.m7011();
                c3915.m7001((byte) 5);
                linkedHashMap.put(strM7011, m707());
                bM7001 = c3915.m7000();
                if (bM7001 != 4) {
                    if (bM7001 == 7) {
                        break;
                    }
                    C3915.m6997(c3915, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bM7001 == 6) {
                c3915.m7001((byte) 7);
            } else if (bM7001 == 4) {
                AbstractC3801.m6765(c3915);
                throw null;
            }
            c2945 = new C2945(linkedHashMap);
        }
        this.f1179--;
        return c2945;
    }

    public /* synthetic */ C0322(int i, int i2, Object obj) {
        this.f1180 = i2;
        this.f1178 = obj;
        this.f1179 = i;
    }

    public C0322(C2612 c2612, int i) {
        this.f1180 = 16;
        AbstractC0487.m1047(c2612);
        this.f1178 = c2612;
        this.f1179 = i;
    }

    public /* synthetic */ C0322(char c, int i) {
        this.f1180 = i;
    }

    public C0322(C3510 c3510, C3915 c3915) {
        this.f1180 = 6;
        this.f1178 = c3915;
    }

    public C0322(C3352 c3352, int i) {
        this.f1180 = 11;
        this.f1178 = c3352;
        this.f1180 = 11;
        this.f1179 = i;
    }

    public C0322(ArrayList arrayList) {
        this.f1180 = 12;
        this.f1178 = arrayList;
    }

    public C0322(Context context) {
        this.f1180 = 0;
        int iM8344 = DialogInterfaceC4964.m8344(context, 0);
        this.f1178 = new C0859(new ContextThemeWrapper(context, DialogInterfaceC4964.m8344(context, iM8344)));
        this.f1179 = iM8344;
    }

    public C0322(int i, InterfaceC3015 interfaceC3015) {
        this.f1180 = 15;
        this.f1179 = i;
        this.f1178 = new C1489(new C3124(i, interfaceC3015));
    }
}
